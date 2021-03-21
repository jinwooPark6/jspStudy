package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx3 extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String adminId2 = getServletConfig().getInitParameter("adminId2");
		String adminPw2 = getServletConfig().getInitParameter("adminPw2");
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId2 : " + adminId2 + "</p>");
		out.print("<p>adminPw2 : " + adminPw2 + "</p>");
		
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerIP = getServletContext().getInitParameter("testServerIP");
		
		out.print("<p>imgDir : " + imgDir + "</p>");
		out.print("<p>testServerIP : " + testServerIP + "</p>");
		
		getServletContext().setAttribute("connectedIP", "165.62.58.33");
		getServletContext().setAttribute("connectedUser", "gilddong");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
