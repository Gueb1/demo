package com.example.demo.Entite;

import java.sql.Date;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class ProjetFreelance {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long Id;
	private String Nom;
	private Date DateDebut ;
	private Date DateFin;
	private String Contenue;
	
	// Relation ManyToOne avec chefprojet
    @ManyToOne
    @JoinColumn(name = "ChefProjet_id") // jointure dans la table chefprojet
    private ChefProjet ChefProjet;
    
 // Relation OneToMany avec Planification
    @OneToMany(mappedBy = "ProjetFreelance") // "projetfreelance
    private Collection<Planification> Planification;
    
	
	
	
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
	public String getContenue() {
		return Contenue;
	}
	public void setContenue(String contenue) {
		Contenue = contenue;
	}
	public ProjetFreelance(Long id, String nom, Date dateDebut, Date dateFin, String contenue) {
		super();
		Id = id;
		Nom = nom;
		DateDebut = dateDebut;
		DateFin = dateFin;
		Contenue = contenue;
	}
	public ProjetFreelance() {
		super();
	}
	
	
}
