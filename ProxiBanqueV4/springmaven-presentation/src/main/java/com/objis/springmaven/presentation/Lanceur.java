package com.objis.springmaven.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objis.springmaven.dao.EmployeDao;
import com.objis.springmaven.domaine.Employe;
import com.objis.springmaven.service.IEmployeService;



public class Lanceur {

	public static void main(String[] args) {
		Employe employe1 = new Employe(1, "couccou", "hibou", "Mathilde", "Massu", "M.m@gmail.com", "emploie");
		Employe employe2 = new Employe(2, "login", "password", "prenom", "nom", "email", "role");
		// 1 Chargement du conteneur
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		// 2 Récupération du bean
		IEmployeService employeService = (IEmployeService) appContext.getBean("employeService");

		// 3 Utilisation du bean
		//employeService.creerEmploye(employe1);
		//employeDao.createEmploye(employe2);
		//employeDao.suprimerEmploye(employe2);
		Employe resulte = employeService.selectEmployeByName(employe1);
		
		System.out.println(resulte);

		appContext.close();

	}

}
