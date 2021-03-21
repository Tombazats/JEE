package fr.epsi.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Idee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titre;
	
	private String description;
	
	private String urlImage;
	
	private String categorie;
	
	private enum notation {TOP, FLOP};
	
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
	public String getUrlImage() {
		return this.urlImage;
	}
    
 
	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
    
	private notation note; 
	
	public notation getNote() {
        return this.note;
    }

    public void setNote(notation note) {
        this.note = note;
    }
	

}
