package com.objis.springmaven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objis.springmaven.domaine.Compte;

public interface ICompteDao extends JpaRepository<Compte, Integer>{
	public Compte findByIdCompte(int idCOmpte);
	//public List<Compte> getCompteByClient(Client client);

}
