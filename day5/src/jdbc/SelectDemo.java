package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) throws Exception{
		 double sal=45000;
		 String addr="hyderabad";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");

		System.out.println(conn.getClass().getName());
		Statement stmt=conn.createStatement();
		//ResultSet rs=stmt.executeQuery("select * from employees");
		ResultSet rs=stmt.executeQuery("select * from employees where salary>"+sal+" and address='"+addr+"'");
		
		while(rs.next()) {
			System.out.println(rs.getInt("empno")+" "+rs.getString("name")+" "
		+rs.getString("address")+" "+rs.getDouble("salary"));
		}
	}

}
