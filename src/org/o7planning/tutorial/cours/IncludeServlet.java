package org.o7planning.tutorial.cours;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter() ;
    	
		RequestDispatcher dispat = req.getRequestDispatcher("includedRessource");
		dispat.include(req, res);
		out.println("<br>");
		req.setAttribute("bonjour", "Bonjour");
		dispat.include(req, res);
		out.println("<br>");
		req.setAttribute("bonsoir", "Bonsoir");
		dispat.include(req, res);
		out.println("<br>");
		out.println("</BODY></HTML>");
	}
}