package com.objis.springmaven.dao;

import java.util.List;

import com.objis.springmaven.domaine.Employe;

public interface IEmployeDao {

	Employe selectEmployeByID(Employe employe);

	Employe selectEmployeByID2(Employe employe);

	Employe selectEmployeByNom(Employe employe);

	void updateEmploye(Employe employe);

	void createEmploye(Employe employe);

	void supressionEmploye(Employe employe);

	public List<Employe> getAllEmployes();

}