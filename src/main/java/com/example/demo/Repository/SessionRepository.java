package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entite.Session;


public interface SessionRepository extends JpaRepository<Session, Long> {



	Session findByTitre(String titre);

	List<Session> findByStatut(String string);


}