package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Idee;


public interface IdeeService {

	List<Idee> getidee();
	
	void creeidee(Idee p);
	
}
