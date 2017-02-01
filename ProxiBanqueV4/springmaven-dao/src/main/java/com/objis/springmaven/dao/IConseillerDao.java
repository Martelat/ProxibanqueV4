package com.objis.springmaven.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.objis.springmaven.domaine.Client;


@Repository
public interface IConseillerDao extends JpaRepository<Client, Integer>{
	
	public Client findByIdClient(int idClient);
	
	public List<Client>	findAllClient();
	
	//public Client saveClient(Client client);

}

