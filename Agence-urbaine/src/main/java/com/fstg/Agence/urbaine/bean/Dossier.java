/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.Agence.urbaine.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Dossier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ref;
	@Temporal(TemporalType.DATE)
	private Date dateArrive;
	private String lieuProjet;
	private BigDecimal superficie;
	private String descriptionProjet;
	private int avis;
	private BigDecimal montantAPayer;
	private BigDecimal montantPaye;
	@Temporal(TemporalType.DATE)
	private Date datePaiement;
	@ManyToOne
	private User architect;
	@ManyToOne
	private Client client;
	@ManyToOne
	private User technicien;

	@ManyToOne
	private TypeDossier typeDossier;
	@ManyToOne
	private TypeProjet typeProjet;
	@ManyToOne
	private Commission commission;
	@OneToMany(mappedBy = "dossier")
	private List<Observation> observations;

	public Dossier() {
		this.superficie = BigDecimal.ZERO;
		this.montantAPayer = BigDecimal.ZERO;
		this.montantPaye = BigDecimal.ZERO;
	}

	

	public Dossier(Long id, String ref, Date dateArrive, String lieuProjet, String descriptionProjet, int avis,
			User architect, Client client, BigDecimal superficie, User technicien, BigDecimal montantAPayer,
			BigDecimal montantPaye, Date datePaiement, TypeDossier typeDossier, TypeProjet typeProjet,
			Commission commission) {
		super();
		this.id = id;
		this.ref = ref;
		this.dateArrive = dateArrive;
		this.lieuProjet = lieuProjet;
		this.descriptionProjet = descriptionProjet;
		this.avis = avis;
		this.architect = architect;
		this.client = client;
		
		if(superficie == null) this.superficie = BigDecimal.ZERO;
		else this.superficie = superficie;
		
		this.technicien = technicien;
		
		if(montantAPayer == null) this.montantAPayer = BigDecimal.ZERO;
		else this.montantAPayer = montantAPayer;
		
		if(montantPaye == null) this.montantPaye = BigDecimal.ZERO;
		else this.montantPaye = montantPaye;
		
		this.datePaiement = datePaiement;
		this.typeDossier = typeDossier;
		this.typeProjet = typeProjet;
		this.commission = commission;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String reference) {
		this.ref = reference;
	}

	public Date getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(Date dateArrive) {
		this.dateArrive = dateArrive;
	}

	public String getLieuProjet() {
		return lieuProjet;
	}

	public void setLieuProjet(String lieuProjet) {
		this.lieuProjet = lieuProjet;
	}

	public String getDescriptionProjet() {
		return descriptionProjet;
	}

	public void setDescriptionProjet(String descriptionProjet) {
		this.descriptionProjet = descriptionProjet;
	}

	public User getArchitect() {
		return architect;
	}

	public void setArchitect(User architect) {
		this.architect = architect;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public BigDecimal getSuperficie() {
		return superficie;
	}

	public void setSuperficie(BigDecimal superficie) {
		this.superficie = superficie;
	}

	public User getTechnicien() {
		return technicien;
	}

	public void setTechnicien(User technicien) {
		this.technicien = technicien;
	}

	public BigDecimal getMontantPaye() {
		return montantPaye;
	}

	public void setMontantPaye(BigDecimal montantPaye) {
		this.montantPaye = montantPaye;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}


	public TypeDossier getTypeDossier() {
		return typeDossier;
	}

	public void setTypeDossier(TypeDossier typeDossier) {
		this.typeDossier = typeDossier;
	}

	public TypeProjet getTypeProjet() {
		return typeProjet;
	}

	public void setTypeProjet(TypeProjet typeProjet) {
		this.typeProjet = typeProjet;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(Commission commission) {
		this.commission = commission;
	}

	
	@JsonIgnore
	public List<Observation> getObservations() {
		return observations;
	}

	@JsonSetter
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	

	public int getAvis() {
		return avis;
	}

	public void setAvis(int avis) {
		this.avis = avis;
	}

	public BigDecimal getMontantAPayer() {
		return montantAPayer;
	}

	public void setMontantAPayer(BigDecimal montantAPayer) {
		this.montantAPayer = montantAPayer;
	}

	@Override
	public String toString() {
		return "Dossier [id=" + id + ", ref=" + ref + ", dateArrive=" + dateArrive + ", lieuProjet=" + lieuProjet
				+ ", descriptionProjet=" + descriptionProjet + ", avis=" + avis + ", architect=" + architect
				+ ", client=" + client + ", superficie=" + superficie + ", technicien=" + technicien + ", montantAPayer="
				+ montantAPayer + ", montantPaye=" + montantPaye + ", datePaiement=" + datePaiement + ", typeDossier="
				+ typeDossier + ", typeProjet=" + typeProjet + ", commission=" + commission + "]";
	}

	

	
	

}
