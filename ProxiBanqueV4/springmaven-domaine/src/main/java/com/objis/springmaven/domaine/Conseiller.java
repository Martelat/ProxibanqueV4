package com.objis.springmaven.domaine;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Marie, Camille, Kenzy
 * 
 *         Classe Conseiller, héritant de la classe Utilisateur
 */
@Entity
public class Conseiller extends Utilisateur {

	public Conseiller(int idConseiller) {
		super();
		this.idConseiller = idConseiller;
	}

	/** identifiant du conseiller */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idConseiller;

	/** Liste des clients sous la responsabilité du conseiller */
	@OneToMany
	private Collection<Client> listeClients;

	/**
	 * Constructeur vide de la classe Conseiller
	 */
	public Conseiller() {
		super();
	}

	/**
	 * Constructeur de la classe Conseiller
	 * 
	 * @param login
	 *            : login de connexion du conseiller
	 * @param pwd
	 *            : mot de passe de connexion du conseiller
	 * @param nom
	 *            : nom du conseiller
	 * @param prenom
	 *            : prénom du conseiller
	 * @param listeClients
	 *            : liste des clients sous la responsabilité du conseiller
	 */
	public Conseiller(String login, String pwd, String nom, String prenom, Collection<Client> listeClients) {
		super(login, pwd, nom, prenom);
		this.listeClients = listeClients;
	}

	
	// Getters & Setters
	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public Collection<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(Collection<Client> listeClients) {
		this.listeClients = listeClients;
	}

}