package com.objis.springmaven.presentation;

import com.objis.springmaven.service.IConseillerService;

public class ClientBean {
	
	//propriété
	
	public IConseillerService conseillerService;

	public IConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(IConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}


//	public void creer(){
//		Employe employe = new Employe(10, "oups", "ok", "yo", "man", "oiy", "emlpye");
//	 employeService.creerEmploye(employe);
//	 
//	 System.out.println("Bien ouej !");
//	}
	
}
