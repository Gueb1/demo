package com.example.demo.Entite;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Inscription {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcandidat;
    private Long idformation;
    private String nom;
    private String prenom;
    private Date date;
    private String email;
    private String Statut;

    
	
	public Long getIdcandidat() {
		return idcandidat;
	}



	public void setIdcandidat(Long idcandidat) {
		this.idcandidat = idcandidat;
	}



	public Long getIdformation() {
		return idformation;
	}



	public void setIdformation(Long idformation) {
		this.idformation = idformation;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getStatut() {
		return Statut;
	}



	public void setStatut(String statut) {
		Statut = statut;
	}



	public Inscription(Long idcandidat, Long idformation, String nom, String prenom, Date date, String email,
			String statut) {
		super();
		this.idcandidat = idcandidat;
		this.idformation = idformation;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.email = email;
		Statut = statut;
	}



	public Inscription() {
		super();
	} 


}

