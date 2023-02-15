import java.sql.*;

public class DataConnection{



    public static void main(String[] args) {
        
        Connection conn=null;
        Statement stmt=null;
        final String DB_URL="jdbc:mysql://db:3306/Employee";
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL, "root", "root");
            stmt=conn.createStatement();
            String sql;
            sql="Select * from Employee.Employee_detail";
            ResultSet rs=stmt.executeQuery(sql);

            while(rs.next()){

                int id=rs.getInt("EmpID");
                String first=rs.getString("FirstName");
                String last=rs.getString("LastName");

                System.out.print("ID -"+id+" First Name: "+ first+" Last Name "+" "+ last);
                System.out.println();

                


            }
            rs.close();
            stmt.close();
            conn.close();

        }catch(SQLException e)
        {
            e.printStackTrace();
        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }
}