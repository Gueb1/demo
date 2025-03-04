package com.example.demo.Entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class Formateur {
	@javax.persistence.Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long Id;
	private String Nom;
	private String Email;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Formateur(Long id, String nom, String email) {
		super();
		Id = id;
		Nom = nom;
		Email = email;
	}
	public Formateur() {
		super();
	}

	
	
	
}
