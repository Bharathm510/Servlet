package com.bharath;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calci extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		{
	
	 int fno=Integer.parseInt(request.getParameter("t1"));
	  int sno=Integer.parseInt(request.getParameter("t2"));
	  String op=request.getParameter("test");
	  PrintWriter pw=response.getWriter();
	  response.setContentType("text/html");
	  if("Add".equalsIgnoreCase(op))
	  {
		  int add=fno+sno;
	   pw.println("<h1>"+ "Sum is +"+add+ "</h1>"+"<br>");
	  }
	  else if("Mul".equalsIgnoreCase(op)) {
		  int Mul=fno*sno;
		   pw.println("<h1>"+ "Mul is +"+Mul+ "</h1>"+"<br>");
	  }
	  else if("sub".equalsIgnoreCase(op)) {
		  int sub=fno-sno;
		   pw.println("<h1>"+ "Sub is +"+sub+ "</h1>"+"<br>");
	}
	  else if("div".equalsIgnoreCase(op)) {
		  int div=fno/sno;
		   pw.println("<h1>"+ "div is +"+div+ "</h1>"+"<br>");
		  
	  }
}
	}
}
	
	
