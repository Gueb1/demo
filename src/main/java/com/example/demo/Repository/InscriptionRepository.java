package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entite.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {

    Inscription findByEmail(String email);

}
