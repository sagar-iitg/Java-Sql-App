import java.sql.*;

public class DataConnection{



    public static void main(String[] args) {
        
        Connection conn=null;
        Statement stmt=null;
        final String DB_URL="jdbc:mysql://db:3306/";
        
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL, "root", "root");
            stmt=conn.createStatement();


            String db_create_sql = "CREATE DATABASE IF NOT EXISTS Employee";
            stmt.executeUpdate(db_create_sql);
            System.out.println("Database created successfully...");  
            
            
            String select_db_sql="use Employee";
            stmt.executeUpdate(select_db_sql);
            
            String table_create_sql = "create table IF NOT EXISTS Employee_detail(EmpID int, FirstName varchar(100), LastName varchar(100))";
            stmt.executeUpdate(table_create_sql);
            System.out.println("Table created successfully..."); 

            String insert_table="insert into Employee_detail (EmpID,FirstName,LastName) values(1, 'Sagar','Kumar')";
            stmt.executeUpdate(insert_table);
           
            String sql;
            sql="Select * from Employee.Employee_detail";
            ResultSet rs=stmt.executeQuery(sql);

            while(rs.next()){

                int id=rs.getInt("EmpID");
                String first=rs.getString("FirstName");
                String last=rs.getString("LastName");

                System.out.print("ID- "+id+"\nFirstName: "+ first+"\nLastName "+" "+ last);
                System.out.println("--------");

                


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