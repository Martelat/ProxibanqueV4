package com.objis.springmaven.domaine;

/**
 * @author Marie, Camille, Kenzy
 * 
 *         Classe abstraite Compte dont hérite les classes Compte Courant et
 *         Compte Epargne
 */

public abstract class Compte {

	/** identifiant du compte */
	private int idCompte;

	/** numéro du compte */
	private int numero;

	/** solde du compte */
	private double solde;

	/** date d'ouverture du compte */
	private String dateOuverture;

	/** taux de rémunération du compte épargne */
	private double tauxRemuneration;

	/** autorisation de découvert du compte courant */
	private double autorisationDecouvert;

	/**
	 * Constructeur vide de la classe Compte
	 */
	public Compte() {
		super();
	}

	/**
	 * Constructeur de la classe Compte
	 * 
	 * @param numero
	 *            : numéro de compte
	 * @param solde
	 *            : solde du compte
	 * @param dateOuverture
	 *            : date d'ouverture du compte
	 * @param tauxRemuneration
	 *            : taux de rémunération du compte épargne
	 * @param autorisationDecouvert
	 *            : montant du découvert autorisé du compte courant
	 */
	public Compte(int numero, double solde, String dateOuverture, double tauxRemuneration,
			double autorisationDecouvert) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.tauxRemuneration = tauxRemuneration;
		this.autorisationDecouvert = autorisationDecouvert;
	}

	// Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	public double getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	public void setAutorisationDecouvert(double autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}

}