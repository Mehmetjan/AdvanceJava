import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

import junit.framework.Assert;

import java.sql.ResultSet;
import java.sql.SQLException;



public class DBconnectionMySQL {

	
	   String url = "jdbc:MySQL://localhost/sampledb";
	   String username = "mehmet";
	   String password = "password";
	
	 @Test
	public void testSampleDB() throws SQLException {
		   
		
		Connection conn = DriverManager.getConnection (url, username, password);
		System.out.println("connected");
		Statement stmt ;
        ResultSet rs ;

         
          stmt = conn.createStatement();
          rs =  stmt.executeQuery("select * from employee");
         
          while (rs.next()) {
        System.out.print(rs.getInt("emp_id")+"\t");
        System.out.print(rs.getString("name")+"\t");
        System.out.print(rs.getInt("age")+"\t");
        System.out.println(rs.getInt("salary")+"\t");
         
          }
          
	 }
	 
	      @Test
          public void validateValue() throws SQLException {
            Connection conn = DriverManager.getConnection (url, username, password);
      		System.out.println("connected");
      		Statement stmt ;
            stmt = conn.createStatement();
            System.out.println("print out singlename and validate with assertion: ");
           
            String quary =("select name from employee where emp_id=6");
            ResultSet rs2=stmt.executeQuery(quary);
            while(rs2.next()) {
            Assert.assertEquals("ekrem", rs2.getString("name"));
            System.out.println("expected value is "+rs2.getString("name"));
          
          }
          
         conn.close();
	}
	 }

