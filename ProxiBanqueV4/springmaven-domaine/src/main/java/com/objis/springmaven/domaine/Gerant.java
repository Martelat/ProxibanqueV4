package com.objis.springmaven.domaine;

import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Marie, Camille, Kenzy
 * 
 *         Classe Gerant, h�ritant de la classe Utilisateur
 */

public class Gerant extends Utilisateur {

	/** identifiant du g�rant */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idGerant;

	/** liste des conseillers sous la responsabilit� du g�rant */
	@OneToMany
	private Collection<Conseiller> listeConseillers;

	/**
	 * Constructeur vide de la classe Gerant
	 */
	public Gerant() {
	}

	/**
	 * Constructeur de la classe Gerant
	 * 
	 * @param login
	 *            : login de connexion du g�rant
	 * @param pwd
	 *            : mot de passe de connexion du g�rant
	 * @param nom
	 *            : nom du g�rant
	 * @param prenom
	 *            : pr�nom du g�rant
	 * @param listeConseillers
	 *            : liste des conseillers sous la responsabilit� du g�rant
	 */
	public Gerant(String login, String pwd, String nom, String prenom, Collection<Conseiller> listeConseillers) {
		super(login, pwd, nom, prenom);
		this.listeConseillers = listeConseillers;
	}

	// Getters et Setters
	public int getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
	}

	public Collection<Conseiller> getListeConseiller() {
		return listeConseillers;
	}

	public void setListeConseiller(Collection<Conseiller> listeConseiller) {
		this.listeConseillers = listeConseiller;
	}

}