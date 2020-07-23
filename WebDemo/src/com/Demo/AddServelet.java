package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//https://www.youtube.com/watch?v=GbF_nBLHP6A&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=10



public class AddServelet  extends HttpServlet{
	//servece method accepts both post and get method
	// dopost only allows post request
	// by default get method is present in form , have to change it post
	// changing method to post in form makes pamameters in url invisible
	
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
