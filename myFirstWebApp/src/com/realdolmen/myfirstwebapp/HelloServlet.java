package com.realdolmen.myfirstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.runtime.RecompilableScriptFunctionData;

@WebServlet ( urlPatterns = "/home")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>HelloerrferWorld</h1>");
		writer.println(req.getLocalName() + ":" + req.getLocalAddr());
		HttpSession session = req.getSession();
		if(session.getAttribute("naam") == null || req.getParameter("naam") !=null ) {
			writer.println("hallo vreemdeling");
			session.setAttribute("naam", req.getParameter("naam"));
		} else {
			writer.println("hallo " + session.getAttribute("naam"));
		}
//		writer.println("naam is:" + sess.getParameter("naam"));
	}
}