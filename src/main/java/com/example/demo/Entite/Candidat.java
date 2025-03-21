package com.example.demo.Entite;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Candidat extends Utilisateur{
	private Long cin;
	private String fillier;
	
	@ManyToMany(mappedBy = "Candidats")
    private Set<Formation> formations;
	
	




	public Long getCin() {
		return cin;
	}


	public void setCin(Long cin) {
		this.cin = cin;
	}


	public String getFillier() {
		return fillier;
	}


	public void setFillier(String fillier) {
		this.fillier = fillier;
	}


	public Set<Formation> getFormations() {
		return formations;
	}


	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}


	public Candidat(long id, String nom, String prenom, String email, String statut, String password, Long cin,
			String fillier) {
		super(id, nom, prenom, email, statut, password);
		this.cin = cin;
		this.fillier = fillier;
	}


	public Candidat() {
		super();
	}

	
	
	
}
