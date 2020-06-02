package com.nt;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SignupForm extends HttpServlet {
@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
	req.setCharacterEncoding("UTF-8");
	String name=req.getParameter("user_name");
	String email=req.getParameter("user_email");
	String pwd=req.getParameter("user_password");
	String bio=req.getParameter("user_bio");
	String job=req.getParameter("user_job");
	String age=req.getParameter("user_age");
 
	String[] interest=req.getParameterValues("user_interest");
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(age);
	System.out.println(pwd);
	System.out.println(bio);
	System.out.println(job);
	
	for(String ints:interest) {
		System.out.println(ints);
	}
	
List<String> interest1=Arrays.asList(interest);

Person1 person=new Person1(name,email,age,pwd,job,bio,interest1);
req.setAttribute("myperson",person);
RequestDispatcher d=req.getRequestDispatcher("login.jsp");
d.forward(req,res);
}
@Override
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	doGet(req,res);
}
}
