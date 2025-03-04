package com.example.demo.Entite;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Foramtion {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	private Long Id;
	private String Nom;
	private Date DateDebut ;
	private Date DateFin;
	private String Email;
	private String Contenue;
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
	public Date getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	public Date getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContenue() {
		return Contenue;
	}
	public void setContenue(String contenue) {
		Contenue = contenue;
	}
	public Foramtion(Long id, String nom, Date dateDebut, Date dateFin, String email, String contenue) {
		super();
		Id = id;
		Nom = nom;
		DateDebut = dateDebut;
		DateFin = dateFin;
		Email = email;
		Contenue = contenue;
	}
	public Foramtion() {
		super();
	}
	
}
