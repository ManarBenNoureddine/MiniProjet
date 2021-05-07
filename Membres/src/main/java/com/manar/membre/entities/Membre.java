package com.manar.membre.entities;



	import java.util.Date;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;
	@Entity

    public class Membre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMembre;
	@NotNull
	@Size (min = 4,max = 15)
	private String nomMembre;
	@Min(value = 10)
	 @Max(value = 10000)
	private Long numMembre;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")

	private Date dateInscription;
	@ManyToOne
	private Conservatoire conservatoire;
	public Membre() {
	super();
	}
	public Membre(String nomMembre, Long numMembre, Date dateInscription) {
	super();
	this.nomMembre = nomMembre;
	this.numMembre = numMembre;
	this.dateInscription = dateInscription;
	}
	public Long getIdMembre() {
		return idMembre;
	}
	public void setIdMembre(Long idMembre) {
		this.idMembre = idMembre;
	}
	public String getNomMembre() {
		return nomMembre;
	}
	public void setNomMembre(String nomMembre) {
		this.nomMembre = nomMembre;
	}
	public Long getNumMembre() {
		return numMembre;
	}
	public void setNumMembre(Long numMembre) {
		this.numMembre = numMembre;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	@Override
	public String toString() {
		return "Membre [idMembre=" + idMembre + ", nomMembre=" + nomMembre + ", numMembre=" + numMembre
				+ ", dateInscription=" + dateInscription + "]";
	}
}


