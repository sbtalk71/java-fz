package com.demo.io;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws Exception{
		
		PrintWriter out=new PrintWriter(new File("test.txt"));
		
		out.write("This is a demo print Writer");
		out.flush();
		

	}

}
