package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServelet  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
				int i=Integer.parseInt(req.getParameter("num1"));
				int j=Integer.parseInt(req.getParameter("num2"));
				int k=i+j;
				PrintWriter out=resp.getWriter();
				out.println("results is "+k);
	}

}
