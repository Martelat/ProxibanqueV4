package com.objis.springmaven.service;

import java.util.List;

import com.objis.springmaven.domaine.Employe;

public interface IEmployeService {

	//M�thodes m�tiers
	void creerEmploye(Employe employe);

	Employe selectEmployeByID(Employe employe);

	Employe selectEmployeByName(Employe employe);

	void updateEmploye(Employe employe);

	void supressionEmploye(Employe employe);

	List<Employe> getAllEmployes();

}