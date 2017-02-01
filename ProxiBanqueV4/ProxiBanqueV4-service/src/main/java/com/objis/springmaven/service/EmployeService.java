package com.objis.springmaven.service;


import java.util.List;

import com.objis.springmaven.dao.IEmployeDao;
import com.objis.springmaven.domaine.Employe;

public class EmployeService implements IEmployeService {
	//Proprietes DAO
	IEmployeDao employeDao;
	
	//Getters & Setters
	

	//Méthodes métiers
	/* (non-Javadoc)
	 * @see com.objis.springmaven.service.IEmployeService#creerEmploye(com.objis.springmaven.domaine.Employe)
	 */
	public void creerEmploye(Employe employe){
		employeDao.createEmploye(employe);
	}
	
	public IEmployeDao getEmployeDao() {
		return employeDao;
	}

	public void setEmployeDao(IEmployeDao employeDao) {
		this.employeDao = employeDao;
	}

	/* (non-Javadoc)
	 * @see com.objis.springmaven.service.IEmployeService#selectEmployeByID(com.objis.springmaven.domaine.Employe)
	 */
	public Employe selectEmployeByID(Employe employe){
		Employe result = employeDao.selectEmployeByID2(employe);
		return result;
		
	}
	
	/* (non-Javadoc)
	 * @see com.objis.springmaven.service.IEmployeService#selectEmployeByName(com.objis.springmaven.domaine.Employe)
	 */
	public Employe selectEmployeByName(Employe employe){
		Employe result = employeDao.selectEmployeByNom(employe);
		return result;
	}
	
	/* (non-Javadoc)
	 * @see com.objis.springmaven.service.IEmployeService#updateEmploye(com.objis.springmaven.domaine.Employe)
	 */
	public void updateEmploye(Employe employe){
		employeDao.updateEmploye(employe);
	}
	
	/* (non-Javadoc)
	 * @see com.objis.springmaven.service.IEmployeService#supressionEmploye(com.objis.springmaven.domaine.Employe)
	 */
	public void supressionEmploye(Employe employe){
		employeDao.supressionEmploye(employe);
	}
	
	/* (non-Javadoc)
	 * @see com.objis.springmaven.service.IEmployeService#getAllEmployes()
	 */
	public List<Employe> getAllEmployes(){
		List<Employe> liste= employeDao.getAllEmployes();
		return liste;
	}
	
	
	
	

}
