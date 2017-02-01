package com.objis.springmaven.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.objis.springmaven.domaine.Conseiller;

public interface IGerantDao extends JpaRepository<Conseiller, Integer>{
	public List<Conseiller> findAllConseiller();
}


