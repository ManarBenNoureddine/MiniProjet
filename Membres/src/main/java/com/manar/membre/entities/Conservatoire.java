package com.manar.membre.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Conservatoire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCon;
	private String nomCon;
	private String numCon;
	
	@JsonIgnore

	@OneToMany(mappedBy = "conservatoire")
	private List<Membre> membres;
	public Conservatoire(String nomCon, String numCon, List<Membre> membres) {
		super();
		this.nomCon = nomCon;
		this.numCon = numCon;
		this.membres = membres;
	}
	public Long getIdCon() {
		return idCon;
	}
	public void setIdCon(Long idCon) {
		this.idCon = idCon;
	}
	public String getNomCon() {
		return nomCon;
	}
	public void setNomCon(String nomCon) {
		this.nomCon = nomCon;
	}
	public String getNumCon() {
		return numCon;
	}
	public void setNumCon(String numCon) {
		this.numCon = numCon;
	}
	public List<Membre> getMembres() {
		return membres;
	}
	public void setMembres(List<Membre> membres) {
		this.membres = membres;
	}
	@Override
	public String toString() {
		return "Conservatoire [idCon=" + idCon + ", nomCon=" + nomCon + ", numCon=" + numCon + ", membres=" + membres
				+ "]";
	}

	
}
