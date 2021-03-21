package fr.epsi.service;

import java.util.List;


import fr.epsi.entite.Utilisateur;


public interface UtilisateurService {

	List<Utilisateur> getUtilisateur();
	
	void creeUtilisateur(Utilisateur p);
	
	List<Utilisateur> recup(String Nom, String MotDePasse);
	
}
