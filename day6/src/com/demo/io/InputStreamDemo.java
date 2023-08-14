package com.demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis=null;
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		File file = new File("c:\\temp\\demo.txt");

		try {
			fis = new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			
			int b = 0;
			while ((b = bis.read()) != -1) {
				//writer code here
				System.out.print((char)b);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File does not Exist");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
