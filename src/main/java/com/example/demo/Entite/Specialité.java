package com.example.demo.Entite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Specialité {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	private Long Id;
	private String Nom;
	private String statut;
	
	
	@OneToMany(mappedBy = "Specialité") // Correction ici
    private Collection<Formation> formations; // Correction du type

	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Specialité(Long id, String nom, String statut) {
		super();
		Id = id;
		Nom = nom;
		this.statut = statut;
	}

	public Specialité() {
		super();
	}

}
