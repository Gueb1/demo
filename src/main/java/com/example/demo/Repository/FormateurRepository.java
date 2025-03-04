package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entite.Formateur;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {
    Formateur findByEmail(String email);
}

