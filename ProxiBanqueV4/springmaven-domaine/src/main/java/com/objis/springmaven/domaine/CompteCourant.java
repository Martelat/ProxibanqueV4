package com.objis.springmaven.domaine;

/**
 * @author Marie, Camille, Kenzy
 * 
 *         Classe CompteCourant, héritant de la classe abstraite Compte
 */

public class CompteCourant extends Compte {

	/** client propriétaire du compte */
	private Client clientCourant;

	/**
	 * Constructeur vide de la classe CompteCourant
	 */
	public CompteCourant() {
		super();
	}

	/**
	 * Constructeur de la classe CompteCourant
	 * 
	 * @param numero
	 *            : numéro du compte
	 * @param solde
	 *            : solde du compte
	 * @param dateOuverture
	 *            : date d'ouverture du compte
	 * @param autorisationDecouvert
	 *            : montant du découvert autorisé du compte courant
	 * @param clientCourant
	 *            : client propriétaire du compte
	 */

//	public CompteCourant(int numero, double solde, String dateOuverture, double autorisationDecouvert, Client clientCourant) {
//		super(numero, solde, dateOuverture, autorisationDecouvert);
//		this.clientCourant = clientCourant;
//	}

	// Getters & Setters
	public Client getClientCourant() {
		return clientCourant;
	}

	public void setClientCourant(Client clientCourant) {
		this.clientCourant = clientCourant;
	}

}