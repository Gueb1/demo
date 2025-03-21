package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entite.Session;
import com.example.demo.Repository.SessionRepository;
import java.util.List;

@RestController
@RequestMapping("/Session")
public class SessionController {
    
    @Autowired
    private SessionRepository sessionRepository;

    @PostMapping("/ajoutSession")
    public String ajoutSession(@RequestBody Session session) {
    	sessionRepository.save(session);
        return "Session ajoutée avec succès";
    }

    @PostMapping("/ajoutavectest")
    public String ajouterAvecTest(@RequestBody Session session) {
        Session ses= this.sessionRepository.findByTitre(session.getTitre());

        if (ses==null) {
            this.sessionRepository.save(session);
            return "Session ajoutée avec succès";
        } else {
            return "Session déjà existante";
        }
    }
 // Mettre à jour une session
    @PostMapping("/modifier")
    public String modifierSession(@RequestBody Session s, Long id) {
        Session session = this.sessionRepository.findById(id).get();
        session.setTitre(s.getTitre());
        session.setDateDebut(s.getDateDebut());
        session.setDateFin(s.getDateFin());
        session.setStatut(s.getStatut());

        session = this.sessionRepository.save(session);
        return "true";
    }

    // Archiver une session
    @PutMapping ("/archiver")
    public String archiver(Long id) {
        Session s = this.sessionRepository.findById(id).get();
        s.setStatut("archivé");
        this.sessionRepository.saveAndFlush(s);
        return "session archivée";
    }

    // Désarchiver une session
    @PutMapping("/desarchiver")
    public String desarchiver(Long id) {
        Session s = this.sessionRepository.findById(id).get();
        s.setStatut("actif");
        this.sessionRepository.saveAndFlush(s);
        return "session désarchivée";
    }

    // Afficher toutes les sessions
    @GetMapping ("/affichertoutes_sessions")
    public List<Session> afficherAll() {
        return this.sessionRepository.findAll();
    }
    // Afficher less session actif
    @GetMapping ("/afficherles_session_actif")
    public List<Session> afficherles_session_actif() {
        return this.sessionRepository.findByStatut("actif");
    }

}
