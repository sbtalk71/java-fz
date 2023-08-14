package com.demo.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.demo.data.Employee;

public class EmpDeserializer2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("emp.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			while (true) {
				Object obj = ois.readObject();

				Employee emp = (Employee) obj;

				System.out.println(emp.getName() + " " + emp.getCity());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("No More Objects to retrieve");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
