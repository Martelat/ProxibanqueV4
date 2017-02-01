package com.objis.springmaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.objis.springmaven.dao.IConseillerDao;
import com.objis.springmaven.domaine.Client;
import com.objis.springmaven.domaine.Compte;
import com.objis.springmaven.domaine.Conseiller;

public class ConseillerService implements IConseillerService {
	
	@Autowired
	IConseillerDao conseillerDao;
	
	public void creerClient(Client client) {
		// TODO Auto-generated method stub
		conseillerDao.save(client);
	}

	public Client editerClient(Client client) {
		// TODO Auto-generated method stub
		Client rClient = conseillerDao.save(client);
		return rClient;
	}

	public List<Compte> listeCompte(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> listClientParConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}





}