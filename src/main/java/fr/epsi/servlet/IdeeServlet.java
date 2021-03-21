package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Idee;
import fr.epsi.service.IdeeService;


@WebServlet("/idee")
public class IdeeServlet extends HttpServlet{
	
	@EJB
	private IdeeService idee;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		
			if(req.getParameter("action").equals("liste")) {
				req.setAttribute("idee", idee.getidee());
		
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ListeIdee.jsp").forward(req, resp);
		
			}
		
			if(req.getParameter("action").equals("creer")) {
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/CreerIdee.jsp").forward(req, resp);
			}
		
	    }
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		
		Idee p=new Idee();
		   p.setTitre(req.getParameter("titre"));
		   p.setDescription(req.getParameter("description"));
		   p.setCategorie(req.getParameter("categorie"));
		   p.setUrlImage(req.getParameter("urlImage"));

		   
		   
			 idee.creeidee(p);
	    }
	

}
