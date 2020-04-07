package org.o7planning.tutorial.cours;


import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitEchelleServlet extends HttpServlet {
	 
    private static final long serialVersionUID = 1L;
 
    private int echelle;

 
    public InitEchelleServlet() {
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
        this.echelle= Integer.parseInt(config.getInitParameter("echelle"));
        System.out.println("Echelle :  "+echelle);
    }
 
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        ServletOutputStream out = response.getOutputStream();
 
        out.println("<html>");
        out.println("<head><title>Init Param</title></head>");
        out.println("<body>");
        out.println("<h3>InitParam du cours  :</h3>");
        out.println("Echelle :  "+echelle + "</p>");
        out.println("</body>");
        out.println("<html>");
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

 
}

