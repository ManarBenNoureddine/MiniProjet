package com.manar.membre.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.manar.membre.entities.Conservatoire;
import com.manar.membre.entities.Membre;


@RepositoryRestResource(path = "rest")

public interface MembreRepository extends JpaRepository<Membre, Long> {
	List<Membre> findByNomMembre(String nom);
	List<Membre> findByNomMembreContains(String nom);
	@Query("select m from Membre m where m.nomMembre like %?1 and m.numMembre > ?2")
	List<Membre> findByNomNum (String nom, Double num);
	@Query("select m from Membre m where m.idCon = ?1")
	List<Membre> findByIdCon (Conservatoire idCon);
	List<Membre> findByIdC(long l);
	List<Membre> findByOrderByNomMembreAsc();
	@Query("select m from Membre m order by m.nomMembre ASC, m.numMembre DESC")
	List<Membre> trierMembresNomsNum ();

}

