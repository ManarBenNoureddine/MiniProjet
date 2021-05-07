package com.manar.membre.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.manar.membre.entities.Conservatoire;
import com.manar.membre.entities.Membre;



public interface MembreService {
	Membre saveMembre(Membre m);
	Membre updateMembre(Membre m);
	void deleteMembre(Membre m);
	void deleteMembreById(Long id);
	Membre getMembre(Long id);
	List<Membre> getAllMembres();
	Page<Membre> getAllMembresParPage(int page, int size);
	List<Membre> findByNomMembre(String nom);
	List<Membre> findByNomMembreContains(String nom);
	List<Membre> findByNomNum (String nom, Double prix);
	List<Membre> findByIdCon (Conservatoire conservatoire);
	List<Membre> findByIdC(Long id);
	List<Membre> findByOrderByNomMembreAsc();
	List<Membre> trierMembresNomsNum();
}
