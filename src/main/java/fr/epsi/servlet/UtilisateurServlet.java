package fr.epsi.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Utilisateur;
import fr.epsi.service.UtilisateurService;

@WebServlet("/Utilisateur")
public class UtilisateurServlet extends HttpServlet{

	@EJB
	private UtilisateurService Utilisateur;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		
			if(req.getParameter("action").equals("Utilisateur")) {
				req.setAttribute("Utilisateur", Utilisateur.getUtilisateur());
		
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Utilisateur.jsp").forward(req, resp);
		
			}
			
			if(req.getParameter("action").equals("Connexion")) {
				req.setAttribute("Utilisateur", Utilisateur.getUtilisateur());
		
				this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Connexion.jsp").forward(req, resp);
		
			}
		
	    }
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		
		
		
		if(req.getParameter("action").equals("Utilisateur")) {
			

			Utilisateur p=new Utilisateur();
			p.setNom(req.getParameter("Nom"));
			p.setMotDePasse(req.getParameter("MotDePasse"));

			Utilisateur.creeUtilisateur(p);
		   
		   
		 }
		
		
		if(req.getParameter("action").equals("Connexion")) {
		   
		   String NomCo = req.getParameter("NomConnexion");
		   String mdp = req.getParameter("MotDePasseConnexion");
		   
		   
		   if(!Utilisateur.recup(NomCo, mdp).isEmpty()) {
			   
			   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ListeIdee.jsp").forward(req, resp);
			   
		   }
		   
		   if(Utilisateur.recup(NomCo,  mdp).isEmpty()) {
			   
			   this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Connexion.jsp").forward(req, resp);
			   
		   }
		   
		}
		   
	  }
	
}
