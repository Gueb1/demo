package com.example.demo.Entite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Formateur extends Utilisateur{
	

	private String specialite;
	
	// Relation OneToMany avec Formation
	@OneToMany(mappedBy = "Formateur")
    private Collection <Formation> Formation;
	
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public Formateur(long id, String nom, String prenom, String email, String statut, String password,
			String specialite) {
		super(id, nom, prenom, email, statut, password);
		this.specialite = specialite;
	}
	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}