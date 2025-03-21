package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entite.Utilisateur;
import com.example.demo.Repository.UtilisateurRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("user")
public class UtilisateurController {

    @Autowired
    UtilisateurRepository userepos;

    @PostMapping("ajoututilisateur")
    public String ajoutUtilisateur(@RequestBody Utilisateur user) {
    	Utilisateur u = this.userepos.save(user);
        return "Utilisateur ajouté avec succès";
    }

    @PostMapping("ajoutavectest")
    public String ajouterAvecTest(@RequestBody Utilisateur user) {
        Utilisateur existingUser = userepos.findByEmail(user.getEmail());

        if (existingUser == null) {
            userepos.save(user);
            return "Utilisateur ajouté avec succès";
        } else {
            return "Utilisateur déjà existant";
        }
    }
}