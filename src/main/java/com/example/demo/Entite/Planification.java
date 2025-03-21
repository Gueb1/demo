package com.example.demo.Entite;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Planification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String description;
    private String taches;

    // Relation ManyToOne avec ProjetFreelance
    @ManyToOne
    @JoinColumn(name = "ProjetFreelance_id") // jointure dans la table ProjetFreelance
    private ProjetFreelance ProjetFreelance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaches() {
        return taches;
    }

    public void setTaches(String taches) {
        this.taches = taches;
    }

    public Planification(Long id, Date date, String description, String taches) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.taches = taches;
    }

    public Planification() {
    }
}
