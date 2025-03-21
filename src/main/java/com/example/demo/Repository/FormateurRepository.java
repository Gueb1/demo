package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entite.Formateur;

public interface FormateurRepository extends JpaRepository<Formateur, Long>{

	Formateur findByEmail(String email);

}
