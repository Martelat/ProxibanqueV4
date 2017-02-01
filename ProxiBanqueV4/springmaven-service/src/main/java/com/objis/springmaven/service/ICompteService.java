package com.objis.springmaven.service;

import com.objis.springmaven.domaine.Client;
import com.objis.springmaven.domaine.Compte;

public interface ICompteService extends IService {

	/**
	 * 
	 * @param client
	 */
	Compte creerCompte(Client client);

	/**
	 * 
	 * @param compteDebite
	 * @param compteCredite
	 * @param montant
	 */
	void virementCompte(Compte compteDebite, Compte compteCredite, double montant);

}