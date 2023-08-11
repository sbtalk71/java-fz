package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectWIthPST {

	public static void main(String[] args) {
		double sal = 45000;
		String addr = "hyderabad";
		
		Connection conn=null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/empdb", "root", "root");

			PreparedStatement pst = conn.prepareStatement("select * from employees where salary=? and address=?");

			pst.setDouble(1, sal);
			pst.setString(2, addr);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("empno") + " " + rs.getString("name") + " " + rs.getString("address") + " "
						+ rs.getDouble("salary"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
