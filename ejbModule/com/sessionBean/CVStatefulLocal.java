package com.sessionBean;

import javax.ejb.Local;

import com.entity.Personne;

@Local
public interface CVStatefulLocal {
	
	public boolean seConnecter(String eMail, String motDePasse);
	
	public void modifierPersonne(Personne personne);

}
