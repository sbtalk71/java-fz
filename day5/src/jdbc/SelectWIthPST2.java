package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectWIthPST2 {

	public static void main(String[] args) {
		double sal = 45000;
		String addr = "hyderabad";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (

				Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/empdb", "root", "root");

				PreparedStatement pst = conn
						.prepareStatement("select * from employees where salary=? and address=?");) {
			pst.setDouble(1, sal);
			pst.setString(2, addr);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("empno") + " " + rs.getString("name") + " " + rs.getString("address") + " "
						+ rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
