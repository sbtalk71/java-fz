package com.demo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RederWriterDemo {

	public static void main(String[] args) {
		FileReader fis = null;
		BufferedReader bis=null;
		
		FileWriter fos=null;
		BufferedWriter bos=null;
		
		File file = new File("c:\\temp\\demo.txt");

		try {
			fis = new FileReader(file);
			bis=new BufferedReader(fis);
			
			fos=new FileWriter("c:\\temp\\demo_1.txt");
			bos=new BufferedWriter(fos);
			
			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
				System.out.print((char)b);
			}

			bos.flush();
			
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
