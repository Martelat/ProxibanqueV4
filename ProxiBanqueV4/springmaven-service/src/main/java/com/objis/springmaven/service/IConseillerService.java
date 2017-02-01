package com.objis.springmaven.service;

import java.util.List;

import com.objis.springmaven.domaine.Client;
import com.objis.springmaven.domaine.Compte;
import com.objis.springmaven.domaine.Conseiller;

public interface IConseillerService extends IService {

	void creerClient(Client client);

	Client editerClient(Client client);

	List<Compte> listeCompte(Client client);

	List<Client> listClientParConseiller(Conseiller conseiller);

}