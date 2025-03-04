package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entite.Administrateur;
import com.example.demo.Repository.AdministrateurRepository;

@RestController
@RequestMapping("admin")
public class AdministrateurController {
    
    @Autowired
    private AdministrateurRepository adminrepos;

    @PostMapping("ajoutad")
    public String ajoutad(@RequestBody Administrateur ad) {
        adminrepos.save(ad);
        return "Admin ajouté";
    }

    @PostMapping("ajoutest")
    public String ajoutest(@RequestBody Administrateur ad) {
        Administrateur existingAdmin = adminrepos.findByEmail(ad.getEmail()); // Recherche l'admin par email
        
        if (existingAdmin == null) {
            adminrepos.save(ad);
            return "Admin ajouté avec succès";
        } else {
            return "Admin déjà existant";
        }
    }
}