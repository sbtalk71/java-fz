package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println(Thread.currentThread().getName());
	resp.setContentType("text/html");
	PrintWriter out =resp.getWriter();
	out.write("<h1>Hello from Servlet</h1>");
	}

}
