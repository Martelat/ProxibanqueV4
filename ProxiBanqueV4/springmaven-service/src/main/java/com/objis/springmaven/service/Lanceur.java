package com.objis.springmaven.service;

import com.objis.springmaven.domaine.Client;
import com.objis.springmaven.domaine.Conseiller;

public class Lanceur {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conseiller conseillerTest = new Conseiller(666);
		Client clientTest = new Client("LeClient", "Jean", "Saint-Cyr Du Mont Julien Doré", 66666666, "leemail@email.mail", conseillerTest);
		ConseillerService conseillerServiceTest = new ConseillerService();
		conseillerServiceTest.creerClient(clientTest);
		
	}

}
