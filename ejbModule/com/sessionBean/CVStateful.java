package com.sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entity.Personne;

/**
 * Session Bean implementation class CVStateful
 */
@Stateful
@LocalBean
public class CVStateful implements CVStatefulLocal {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public boolean seConnecter(String eMail, String motDePasse) {
		Query query = em.createQuery("SELECT p FROM Personne p WHERE P.eMail =: eMail AND p.motDePasse =: motDePasse");
		query.setParameter("eMail", eMail);
		query.setParameter("motDePasse", motDePasse);
		try {
			query.getSingleResult();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public void modifierPersonne(Personne personne) {
		em.merge(personne);
		
	}

  
}
