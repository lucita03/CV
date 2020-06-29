package com.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Nature
 *
 */
@Entity

public class Nature implements Serializable {

	   
	@Id
	private int idNature;
	private String libelle;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "idActivite")
	private Activite activite;

	public Nature() {
		super();
	}   
	public int getIdNature() {
		return this.idNature;
	}

	public void setIdNature(int idNature) {
		this.idNature = idNature;
	}   
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Activite getActivite() {
		return activite;
	}
   
	
}
