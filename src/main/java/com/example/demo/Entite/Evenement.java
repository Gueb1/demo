package com.example.demo.Entite;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Evenement {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	private Long Id;
	private String Titre;
	private Date Date;
	
	// Relation ManyToOne avec admin
    @ManyToOne
    @JoinColumn(name = "Administrateur_id") // jointure dans la table admin
    private Administrateur Administrateur;
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Evenement(Long id, String titre, java.sql.Date date) {
		super();
		Id = id;
		Titre = titre;
		Date = date;
	}
	public Evenement() {
		super();
	}


}
