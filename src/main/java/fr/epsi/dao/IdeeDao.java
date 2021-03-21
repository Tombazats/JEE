package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Idee;


public interface IdeeDao {
	
	void create(Idee p);
	
	List<Idee> getidee();

}
