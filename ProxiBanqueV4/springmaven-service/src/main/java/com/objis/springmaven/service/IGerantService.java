package com.objis.springmaven.service;

import java.util.List;

import com.objis.springmaven.domaine.Conseiller;

public interface IGerantService extends IService {

	List<Conseiller> listeConseiller();

}