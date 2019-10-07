package com.bridgelabz.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquarServlet extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException 
  {
	  int k= (int)request.getAttribute("k");
	  k=k*k;
	  PrintWriter out=response.getWriter();
	  out.println("result is"+k);
	  
  }
}
