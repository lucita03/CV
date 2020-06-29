package com.sessionBean;

import java.util.List;

import javax.ejb.Local;

import com.entity.Activite;
import com.entity.Nature;
import com.entity.Personne;

@Local
public interface CVStatelessLocal {
	
	public void addUser(Personne personne); //pour l'ajout d'une personne
	public void addCV(Activite activite, Nature nature); // pour l'ajout des CV
	public List<Activite> getAllcv(); // consulter tous les cv
	public List<Activite> findcv(String var);   // chercher des cv

}
