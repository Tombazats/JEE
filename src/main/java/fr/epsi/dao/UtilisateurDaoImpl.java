package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;


import fr.epsi.entite.Utilisateur;

public class UtilisateurDaoImpl implements UtilisateurDao {

	EntityManager em;
	UserTransaction utx;
	public UtilisateurDaoImpl(EntityManager em, UserTransaction utx) {
		this.em=em;
		this.utx=utx;
	}

	public void create(Utilisateur p) {
		
			try {
				utx.begin();
				em.persist(p);
				utx.commit();
			} catch (NotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RollbackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (HeuristicMixedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (HeuristicRollbackException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}

	public List<Utilisateur> getUtilisateur() {
		return em.createQuery("select p from Utilisateur p", Utilisateur.class).getResultList(); //Requete dans la bdd
	}

	public List<Utilisateur> recup(String Nom, String MotDePasse) {
		return em.createQuery("select p from Utilisateur p where p.nom = :Nom and p.MotDePasse = :MotDePasse", Utilisateur.class).setParameter("Nom", Nom).setParameter("MotDePasse", MotDePasse).getResultList(); //Requete dans la bdd
	}


}
