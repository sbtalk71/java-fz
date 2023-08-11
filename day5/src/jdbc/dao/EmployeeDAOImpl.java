package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import collections.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public String save(Employee e) {

		

		return null;
	}

	@Override
	public String delete(int empId) {

		return null;
	}

	@Override
	public String update(Employee e) {

		return null;
	}

	@Override
	public Employee findById(int empId) {
		Employee emp= new Employee();
		try {
			Connection conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from employees where empno=?");

			pst.setInt(1,empId);
			

			ResultSet rs = pst.executeQuery();

			if(rs.next()) {
				emp.setEmpId(rs.getInt("empno"));
				emp.setName(rs.getString("name"));
				emp.setCity(rs.getString("address"));
				emp.setSalary(rs.getDouble("salary"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/empdb", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		return conn;
	}
}
