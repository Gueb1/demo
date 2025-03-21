package com.example.demo.Entite;

import java.util.Date;

public class Postuler {
	private Long idProjet;
	private Long idcondidat;
	private String Nom;
	private String Prenom;
	private String Email;
	private Date date;
	private String Contenue;
	
	
	
	public Long getIdProjet() {
		return idProjet;
	}



	public void setIdProjet(Long idProjet) {
		this.idProjet = idProjet;
	}



	public Long getIdcondidat() {
		return idcondidat;
	}



	public void setIdcondidat(Long idcondidat) {
		this.idcondidat = idcondidat;
	}



	public String getNom() {
		return Nom;
	}



	public void setNom(String nom) {
		Nom = nom;
	}



	public String getPrenom() {
		return Prenom;
	}



	public void setPrenom(String prenom) {
		Prenom = prenom;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getContenue() {
		return Contenue;
	}



	public void setContenue(String contenue) {
		Contenue = contenue;
	}



	public Postuler(Long idProjet, Long idcondidat, String nom, String prenom, String email, Date date,
			String contenue) {
		super();
		this.idProjet = idProjet;
		this.idcondidat = idcondidat;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		this.date = date;
		Contenue = contenue;
	}



	public Postuler() {
		super();
	}


	
}
