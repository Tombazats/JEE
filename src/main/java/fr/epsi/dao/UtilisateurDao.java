package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Utilisateur;


public interface UtilisateurDao {
	
	void create(Utilisateur p);
	
	List<Utilisateur> getUtilisateur();
	
	List<Utilisateur> recup(String Nom, String MotDePasse);

}
