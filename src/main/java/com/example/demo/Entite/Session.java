package com.example.demo.Entite;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Session {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	private Long Id;
	private String Nom;
	private Date DateDebut ;
	private Date DateFin;
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
	public Session(Long id, String nom, Date dateDebut, Date dateFin) {
		super();
		Id = id;
		Nom = nom;
		DateDebut = dateDebut;
		DateFin = dateFin;
	}
	public Session() {
		super();
	}

}
