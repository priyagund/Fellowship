package com.bridgelabz.loginservlet;
import com.bridgelabz.loginservlet.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException 
{
	int i=Integer.parseInt(request.getParameter("num1"));
	int j=Integer.parseInt(request.getParameter("num2"));
	int k=i+j;
	//PrintWriter out=res.getWriter();
	//out.println("result is"+k);
	//k=k*k;
	request.setAttribute("k", k);
	RequestDispatcher rd=request.getRequestDispatcher("multiply");
	rd.forward(request, response);
		
		
	
}
}
