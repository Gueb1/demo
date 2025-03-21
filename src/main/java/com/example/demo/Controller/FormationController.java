package com.example.demo.Controller;

import com.example.demo.Entite.Formation;
import com.example.demo.Repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Formation")
public class FormationController {
    @Autowired
    private FormationRepository formationRepository;

    @PostMapping("ajoutFormation")
    public String ajoutFormation(@RequestBody Formation formation) {
        formationRepository.save(formation);
        return "Formation ajoutée avec succès";
    }

    @PostMapping("ajoutAvecTest")
    public String ajoutAvecTest(@RequestBody Formation formation) {
    	Formation format=this.formationRepository.findByName(formation.getName());
    	if(format==null)
    	{this.formationRepository.save(formation);
    		return ("formation ajoutée");
    	}else
    	{
    		return ("formation existe");
    	}
    }
 // Mettre à jour une formation
    @PostMapping("/modifier")
    public String modifierFormation(@RequestBody Formation f, Long id) {
        Formation formation = this.formationRepository.findById(id).get();
        formation.setName(f.getName());
        formation.setDateDebut(f.getDateDebut());
        formation.setDateFin(f.getDateFin());
        formation.setContenue(f.getContenue());
        formation.setStatut(f.getStatut());

        formation = this.formationRepository.save(formation);
        return "true";
    }

    // Archiver une formation
    @PutMapping("/archiver")
    public String archiver(Long id) {
        Formation f = this.formationRepository.findById(id).get();
        f.setStatut("archivé");
        this.formationRepository.saveAndFlush(f);
        return "formation archivé";
    }

    // Désarchiver une formation
    @PutMapping("/desarchiver")
    public String desarchiver(Long id) {
        Formation f = this.formationRepository.findById(id).get();
        f.setStatut("actif");
        this.formationRepository.saveAndFlush(f);
        return "formation desarchive";
    }

    // Afficher toutes les formations
    @GetMapping("/affichertoutes_formations")
    public List<Formation> afficherAll() {
        return this.formationRepository.findAll();
    }
}

