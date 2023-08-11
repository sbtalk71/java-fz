package jdbc.dao;

import collections.Employee;

public class DaoMain {

	public static void main(String[] args) {
		EmployeeDAO dao= new EmployeeDAOImpl();
		
		Employee emp= dao.findById(1033);
		
		System.out.println(emp.getName());

	}

}
