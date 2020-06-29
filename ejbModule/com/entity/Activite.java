package com.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Activite
 *
 */
@Entity

public class Activite implements Serializable {

	   
	@Id
	private int idActivite;
	private String titre;
	private String description;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	@JoinTable(name = "T_Association",
			joinColumns = @JoinColumn(name = "idActivite"),
			inverseJoinColumns = @JoinColumn(name = "idPersonne"))
	private List<Personne> personnes = new ArrayList<>();
	
	@OneToMany (targetEntity = Nature.class, mappedBy = "activite")
	private List<Nature> Natures = new ArrayList<>(); 

	public Activite() {
		super();
	}   
	public int getIdActivite() {
		return this.idActivite;
	}

	public void setIdActivite(int idActivite) {
		this.idActivite = idActivite;
	}   
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public List<Nature> getNatures() {
		return Natures;
	}
	
	
   
}
