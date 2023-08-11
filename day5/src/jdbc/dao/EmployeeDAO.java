package jdbc.dao;

import java.util.List;

import collections.Employee;

public interface EmployeeDAO {

	public String save(Employee e);
	public String delete(int empId);
	public String update(Employee e);
	public Employee findById(int empId);
	
	public List<Employee> findAll();
}
