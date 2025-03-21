package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entite.Inscription;
import com.example.demo.Repository.InscriptionRepository;
@RestController
@RequestMapping("inscri")
public class InscriptionController {
	

	 @Autowired
	 InscriptionRepository inscrirepos;

	    @PostMapping("ajoutinscri")
	    public String ajoutInscription(@RequestBody Inscription inscri) {
	    	Inscription i = this.inscrirepos.save(inscri);
	        return "inscription ajouté avec succès";
	    }

	    @PostMapping("ajoutavectest")
	    public String ajouterAvecTest(@RequestBody Inscription inscri) {
	    	Inscription existingUser = inscrirepos.findByEmail(inscri.getEmail());

	        if (existingUser == null) {
	        	inscrirepos.save(inscri);
	            return "Inscription ajouté avec succès";
	        } else {
	            return "Inscription déjà existant";
	        }
	    }
	}
