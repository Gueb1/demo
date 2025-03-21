package com.example.demo.Entite;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Session {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	private Long id;
	private String titre;
	private String statut;
	private Date dateDebut ;
	private Date dateFin;
	
	@ManyToOne
    @JoinColumn(name = "Formation_id")
    private Formation Formation;
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getStatut() {
		return statut;
	}



	public void setStatut(String statut) {
		this.statut = statut;
	}



	public Date getDateDebut() {
		return dateDebut;
	}



	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}



	public Date getDateFin() {
		return dateFin;
	}



	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}



	public Session(Long id, String titre, String statut, Date dateDebut, Date dateFin) {
		super();
		this.id = id;
		this.titre = titre;
		this.statut = statut;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}



	public Session() {
		super();
	}

}
