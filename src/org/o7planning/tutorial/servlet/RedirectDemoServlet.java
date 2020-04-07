package org.o7planning.tutorial.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/other/redirectDemo")
public class RedirectDemoServlet extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    // Request:
    // http://localhost:8080/ServletTutorial/other/redirectDemo?redirect=true
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // Obtenez de la valeur de paramètre (parameter) sur URL.
        String redirect = request.getParameter("redirect");
 
        if ("true".equals(redirect)) {
            System.out.println("Redirect to ShowMeServlet");
 
            // contextPath: est une chaine vide "" ou non-vide.
            // Si elle est non vide, elle commence toujours par /
            // et ne se termine pas par /
            String contextPath = request.getContextPath();
 
            // ==> /ServletTutorial/showMe
            response.sendRedirect(contextPath + "/showMe");
            return;
        }
 
        ServletOutputStream out = response.getOutputStream();
        out.println("<h3>Text of RedirectDemoServlet</h3>");
        out.println("- servletPath=" + request.getServletPath());
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }
 
}