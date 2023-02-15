```
import java.sql.*;

public class JDBCExample {
 

   public static void main(String[] args) {
      // Open a connection

        Connection conn=null;
        Statement stmt=null;
        final String DB_URL = "jdbc:mysql://localhost/";
       
      try{
      
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection(DB_URL, "root", "root");
        stmt = conn.createStatement();
   	      
         String db_create_sql = "CREATE DATABASE CheckDB";
         stmt.executeUpdate(db_create_sql);
         System.out.println("Database created successfully...");   
         String select_db_sql="use CheckDB";
         stmt.executeUpdate(select_db_sql);
         
         String table_create_sql = "create table Employee_detail(EmpID int, FirstName varchar(100), LastName varchar(100))";
         stmt.executeUpdate(table_create_sql);
         System.out.println("Table created successfully...");   


      } catch (SQLException e) {
         e.printStackTrace();
      } catch(Exception e)
      {
        e.printStackTrace();
      }
   }
}
```
