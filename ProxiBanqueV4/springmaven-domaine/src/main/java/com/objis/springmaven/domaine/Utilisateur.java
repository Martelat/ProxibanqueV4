package com.objis.springmaven.domaine;

/**
 * @author Marie, Camille, Kenzy
 * 
 *         Classe abstraite Utilisateur
 */

public abstract class Utilisateur {

	/** login de connexion de l'utilisateur */
	private String login;

	/** mot de passe de connexion de l'utilisateur */
	private String pwd;

	/** nom de l'utilisateur */
	private String nom;

	/** prenom de l'utilisateur */
	private String prenom;

	/**
	 * Constructeur vide de la classe Utilisateur
	 */
	public Utilisateur() {
		super();
	}

	/**
	 * Constructeur de la classe Utilisateur
	 * 
	 * @param login
	 *            : login de connexion de l'utilisateur
	 * @param pwd
	 *            : mot de passe de connexion de l'utilisateur
	 * @param nom
	 *            : nom de l'utilisateur
	 * @param prenom
	 *            : prenom de l'utilisateur
	 */
	public Utilisateur(String login, String pwd, String nom, String prenom) {
		super();
		this.login = login;
		this.pwd = pwd;
		this.nom = nom;
		this.prenom = prenom;
	}

	// Getters & Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}