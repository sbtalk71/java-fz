package com.demo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import com.demo.data.Employee;

public class EmpSerializer {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("emp.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			Employee emp=new Employee(100, "James", 67000, "Mumbai");
			
			oos.writeObject(emp);

		} catch (NotSerializableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
