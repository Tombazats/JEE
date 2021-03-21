package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.UtilisateurDao;
import fr.epsi.dao.UtilisateurDaoImpl;
import fr.epsi.entite.Utilisateur;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class UtilisateurServiceImpl implements UtilisateurService{

	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private UserTransaction utx;


	public List<Utilisateur> getUtilisateur() {
		UtilisateurDao dao=new UtilisateurDaoImpl(em, utx);
		return dao.getUtilisateur();
	}

	public void creeUtilisateur(Utilisateur p) {
		UtilisateurDao dao=new UtilisateurDaoImpl(em, utx);
		dao.create(p);	
	}

	public List<Utilisateur> recup(String Nom, String MotDePasse) {
		UtilisateurDao dao=new UtilisateurDaoImpl(em, utx);
		return dao.recup(Nom, MotDePasse);	
	}


	
}
