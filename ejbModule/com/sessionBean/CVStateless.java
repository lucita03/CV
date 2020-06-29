package com.sessionBean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entity.Activite;
import com.entity.Nature;
import com.entity.Personne;

/**
 * Session Bean implementation class CVStateless
 */
@Stateless
@LocalBean
public class CVStateless implements CVStatelessLocal {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addUser(Personne personne) {
		em.persist(personne); 
	}

	@Override
	public void addCV(Activite activite, Nature nature) {
		em.persist(activite);
		em.persist(nature);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Activite> getAllcv() {
		Query query = em.createQuery("select a from Activite a");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Activite> findcv(String var) { 
	Query query = em.createQuery("select a from Activite a where a.titre like" +var);
	return query.getResultList();
}

    
    }
