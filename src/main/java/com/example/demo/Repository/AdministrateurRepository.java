package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entite.Administrateur;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {
	Administrateur findByEmail(String email);

	

}
