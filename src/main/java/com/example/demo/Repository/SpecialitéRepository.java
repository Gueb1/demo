package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entite.Specialité;

public interface SpecialitéRepository extends JpaRepository<Specialité, Long> {

	List<Specialité> findByStatut(String string);
}
