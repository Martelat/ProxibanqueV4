package com.objis.springmaven.presentation;


import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.objis.springmaven.domaine.Employe;
import com.objis.springmaven.service.IEmployeService;


public class UserBean {
	
	//propriété
	
	IEmployeService employeService;

	public IEmployeService getEmployeService() {
		return employeService;
	}

	public void setEmployeService(IEmployeService employeService) {
		this.employeService = employeService;
	}
	
	public void creer(){
		Employe employe = new Employe(10, "oups", "ok", "yo", "man", "oiy", "emlpye");
	 employeService.creerEmploye(employe);
	 
	 System.out.println("Bien ouej !");
	}
}
