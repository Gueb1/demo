package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entite.Candidat;
import com.example.demo.Repository.CandidatRepository;



@RestController
@RequestMapping("Candidat")

public class CandidatController {

    @Autowired
    private CandidatRepository candidatrepos;

    @PostMapping("ajoutCandidat")
    public String ajoutCandidat(@RequestBody Candidat can) {
        Candidat c = this.candidatrepos.save(can);
        return "Candidat ajouté avec succès";
    }

    @PostMapping("ajoutavectest")
    public String ajouterAvecTest(@RequestBody Candidat can) {
        Candidat existingUser = candidatrepos.findByEmail(can.getEmail());

        if (existingUser == null) {
            candidatrepos.save(can);
            return "Candidat ajouté avec succès";
        } else {
            return "Candidat déjà existant";
        }
    }
}
