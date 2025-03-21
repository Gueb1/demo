package com.example.demo.Entite;

import java.sql.Date;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long Id;
	private String name;
	private Date dateDebut ;
	private Date dateFin;
	private String contenue;
	private String statut;
	
	// Relation ManyToOne avec formateur
    @ManyToOne
    @JoinColumn(name = "Formateur_id") // jointure dans la table Formation
    private Formateur Formateur;
	
    @OneToMany(mappedBy = "Formation")
    private Collection<Session> Session;
    
    @ManyToOne
    @JoinColumn(name = "Specialité_id")
    private Specialité Specialité;
	
    @ManyToMany
    @JoinTable(
            name = "Inscription", 
            joinColumns = @JoinColumn(name = "formation_id"), 
            inverseJoinColumns = @JoinColumn(name = "candidat_id")
        )
    private Set<Candidat>Candidats;

    


	public Long getId() {
		return Id;
	}





	public void setId(Long id) {
		Id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
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





	public String getContenue() {
		return contenue;
	}





	public void setContenue(String contenue) {
		this.contenue = contenue;
	}





	public String getStatut() {
		return statut;
	}





	public void setStatut(String statut) {
		this.statut = statut;
	}





	public Formateur getFormateur() {
		return Formateur;
	}





	public void setFormateur(Formateur formateur) {
		Formateur = formateur;
	}





	public Collection<Session> getSession() {
		return Session;
	}





	public void setSession(Collection<Session> session) {
		Session = session;
	}





	public Specialité getSpecialité() {
		return Specialité;
	}





	public void setSpecialité(Specialité specialité) {
		Specialité = specialité;
	}





	public Collection<Candidat> getCandidats() {
		return Candidats;
	}





	public void setCandidats(Set<Candidat> candidats) {
		Candidats = candidats;
	}





	public Formation(Long id, String name, Date dateDebut, Date dateFin, String contenue, String statut) {
		super();
		Id = id;
		this.name = name;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.contenue = contenue;
		this.statut = statut;
	}





	public Formation() {
		super();
	}
	
	
}

