package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entite.Specialité;
import com.example.demo.Repository.SpecialitéRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Specialite")
public class SpecialitéController {
    @Autowired
    private SpecialitéRepository specialiteRepository;

    @PostMapping("ajoutSpecialite")
    public String ajoutSpecialite(@RequestBody Specialité specialite) {
        specialiteRepository.save(specialite);
        return "Spécialité ajoutée avec succès";
    }

    @PostMapping("ajoutAvecTest")
    public String ajoutAvecTest(@RequestBody Specialité specialite) {
        Specialité existingSpecialite = specialiteRepository.findById(specialite.getId()).get();
        
        if (existingSpecialite== null) {
            specialiteRepository.save(specialite);
            return "Spécialité ajoutée avec succès";
        } else {
            return "Spécialité déjà existante";
        }
    }

    // Mettre à jour une spécialité
    @PostMapping("/modifier")
    public String modifierSpecialite(@RequestBody Specialité s, Long id) {
        Specialité specialite = this.specialiteRepository.findById(id).get();
        specialite.setNom(s.getNom());
        specialite.setStatut(s.getStatut());
        
        specialite = this.specialiteRepository.save(specialite);
        return "true";
    }

    // Archiver une spécialité
    @PutMapping("/archiver")
    public String archiver(Long id) {
        Specialité s = this.specialiteRepository.findById(id).get();
        s.setStatut("archivé");
        this.specialiteRepository.saveAndFlush(s);
        return "Spécialité archivée";
    }

    // Désarchiver une spécialité
    @PutMapping("/desarchiver")
    public String desarchiver(Long id) {
        Specialité s = this.specialiteRepository.findById(id).get();
        s.setStatut("actif");
        this.specialiteRepository.saveAndFlush(s);
        return "Spécialité désarchivée";
    }

    // Afficher toutes les spécialités
    @GetMapping("/affichertoutes_specialites")
    public List<Specialité> afficherAll() {
        return this.specialiteRepository.findAll();
    }

    // Afficher les spécialités actives
    @GetMapping("/afficherles_specialites_actives")
    public List<Specialité> afficherles_specialites_actives() {
        return this.specialiteRepository.findByStatut("actif");
    }
}
