package com.demo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import com.demo.data.Employee;

public class EmpSerializer2 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("emp.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			Employee emp = new Employee(100, "James", 67000, "Mumbai");

			oos.writeObject(emp);

			Employee emp1 = new Employee(101, "lATHA", 97000, "Hyderabad");

			oos.writeObject(emp1);

		} catch (NotSerializableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
