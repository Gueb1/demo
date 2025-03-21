package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entite.Formateur;
import com.example.demo.Repository.FormateurRepository;

@RestController
@RequestMapping("formateur")
public class FormateurController {

    @Autowired
    FormateurRepository formateurrepos;

    @PostMapping("ajoutformateur")
    public String ajoutformateur(@RequestBody Formateur formateur) {
        Formateur f = this.formateurrepos.save(formateur);
        return "Formateur ajouté avec succès";
    }

    @PostMapping("ajoutavectest")
    public String ajouterAvecTest(@RequestBody Formateur formateur) {
        Formateur existingUser = formateurrepos.findByEmail(formateur.getEmail());

        if (existingUser == null) {
            formateurrepos.save(formateur);
            return "Formateur ajouté avec succès";
        } else {
            return "Formateur déjà existant";
        }
    }
}
