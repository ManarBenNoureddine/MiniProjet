package com.manar.membre.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.manar.membre.entities.Conservatoire;
import com.manar.membre.entities.Membre;
import com.manar.membre.repos.MembreRepository;



		@Service
		public class MembreServiceImpl implements MembreService {
		@Autowired
		MembreRepository membreRepository;
		@Override
		public Membre saveMembre(Membre m) {
		return membreRepository.save(m);
		}
		@Override
		public Membre updateMembre(Membre m) {
		return membreRepository.save(m);
		}
		@Override
		public void deleteMembre(Membre m) {
			membreRepository.delete(m);
		}
		 @Override
		public void deleteMembreById(Long id) {
			 membreRepository.deleteById(id);
		}
		@Override
		public Membre getMembre(Long id) {
		return membreRepository.findById(id).get();
		}
		@Override
		public List<Membre> getAllMembres() {
		return membreRepository.findAll();
		}
		@Override
		public Page<Membre> getAllMembresParPage(int page, int size) {
		return membreRepository.findAll(PageRequest.of(page, size));
		}
		@Override
		public List<Membre> findByNomMembre(String nom) {
			return membreRepository.findByNomMembre(nom);
		}
		@Override
		public List<Membre> findByNomMembreContains(String nom) {
			return membreRepository.findByNomMembreContains(nom);
		}
		@Override
		public List<Membre> findByNomNum(String nom, Double num) {
			return membreRepository.findByNomNum(nom, num);
		}
		@Override
		public List<Membre> findByIdCon(Conservatoire conservatoire) {
			
			return membreRepository.findByIdCon(conservatoire);
		}
		@Override
		public List<Membre> findByIdC(Long id) {
			return membreRepository.findByIdC(id);
		}
		@Override
		public List<Membre> findByOrderByNomMembreAsc() {
			return membreRepository.findByOrderByNomMembreAsc();
		}
		@Override
		public List<Membre> trierMembresNomsNum() {
			return membreRepository.trierMembresNomsNum();
		}
	}
		


	
		
	