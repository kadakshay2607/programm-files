package com.te.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Gmail
 */
@WebServlet("/Gmail")
public class Gmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	      PrintWriter pr = response.getWriter();
	      String name = request.getParameter("use");
	      String pass = request.getParameter("pwd");
	      pr.println("Name = "+name+ "</br>");
	      pr.println("Password = "+pass+"</br>");
	      String [] ho = request.getParameterValues("box1");
	      pr.println("Hobbies : ");
	      for (int i = 0; i < ho.length; i++) {
			pr.println(ho[i]);
		}
	      pr.println("</br>");
	      pr.println("Gender : ");
	      String [] ge = request.getParameterValues("r1");
	      for (int i = 0; i < ge.length; i++) {
			pr.println(ge[i]);
		} 
	}

}
