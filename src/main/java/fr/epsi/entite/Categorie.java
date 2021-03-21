package fr.epsi.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    
    
    @OneToMany(mappedBy = "categorie")
    private List<Idee> idee;
    
    
	public String getNom() {
        return this.nom;
	}

	public void setNom(String nom) {
        this.nom = nom;
	}
	
}
