package com.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity

public class Personne implements Serializable {

	@Id
	private int idPersonne;
	private String nom;
	private String prenom;
	private String motDePasse;
	private String eMail;
	private String siteWeb;
	private static final long serialVersionUID = 1L;

	@ ManyToMany
	@JoinTable(name = "T_Association",
			joinColumns = @JoinColumn(name = "idPersonne"),
			inverseJoinColumns = @JoinColumn(name = "idActivite"))
	private List<Activite> activites = new ArrayList<>();

	public Personne() {
		super();
	}   
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}   
	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}   
	public String getSiteWeb() {
		return this.siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public List<Activite> getActivites() {
		return activites;
	}
  
	
}
