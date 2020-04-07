package org.o7planning.tutorial.cours;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CompteurServlet extends HttpServlet {
	 
    private static final long serialVersionUID = 1L;
 
    private int compteur;

 
    public CompteurServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Cette méthode est toujours appelée une seule fois
    // dès que l'objet Servlet est créé.
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // Obtenez la valeur du paramètre d'initialisation (initialization parameter) du Servlet.
        // (Selon la configuration de ce servlet dans web.xml).
        this.compteur= Integer.parseInt(config.getInitParameter("echelle"));
        System.out.println("compteur :  "+compteur);
    }
 
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
 
    	response.setContentType("text/plain");
    	PrintWriter pw = response.getWriter() ;
    	
    	while (compteur > 0) {
    		response.setHeader("Refrech", "1");
    		--compteur ;
    		pw.println(compteur + "...");
    	}
    	pw.println("Fin");
    	
        ServletOutputStream out = response.getOutputStream();
 
        out.println("<html>");
        out.println("<head><title>Init Param</title></head>");
        out.println("<body>");
        out.println("<h3>Compteur du cours  :</h3>");
        out.println("Echelle :  "+compteur + "</p>");
        out.println("</body>");
        out.println("<html>");
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

 
}

