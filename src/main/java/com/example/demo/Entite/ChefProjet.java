package com.example.demo.Entite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
public class ChefProjet extends Utilisateur{
    private String DescriptionProfil ;

    
 // Relation OneToMany avec Projetfreelance
    @OneToMany(mappedBy = "ChefProjet") // "client" est le nom de l'attribut dans Formation
    private Collection<ProjetFreelance> ProjetFreelance;
	

	public String getDescriptionProfil() {
		return DescriptionProfil;
	}


	public void setDescriptionProfil(String descriptionProfil) {
		DescriptionProfil = descriptionProfil;
	}


	


	public ChefProjet(long id, String nom, String prenom, String email, String statut, String password,
			String descriptionProfil) {
		super(id, nom, prenom, email, statut, password);
		DescriptionProfil = descriptionProfil;
	}


	public ChefProjet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    
}