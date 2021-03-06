package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.IdeeDao;
import fr.epsi.dao.IdeeDaoImpl;
import fr.epsi.entite.Idee;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class IdeeServiceImpl implements IdeeService{

	@PersistenceContext
	private EntityManager em;
	
	@Resource
    private UserTransaction utx;


	public List<Idee> getidee() {
		IdeeDao dao=new IdeeDaoImpl(em, utx);
		return dao.getidee();
	}

	public void creeidee(Idee p) {
		IdeeDao dao=new IdeeDaoImpl(em, utx);
		dao.create(p);	
	}

	
}
