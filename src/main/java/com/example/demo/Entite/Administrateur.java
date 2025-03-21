package com.example.demo.Entite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Administrateur extends Utilisateur{

    

    private String type;

 // Relation OneToMany avec Evenement
    @OneToMany(mappedBy = "Administrateur") // "projetfreelance
    private Collection<Evenement> Evenement;
    
    
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


    public Administrateur() {
    }

	public Administrateur(long id, String nom, String prenom, String email, String statut, String password,
			String type) {
		super(id, nom, prenom, email, statut, password);
		this.type = type;
	}
}