package com.objis.springmaven.domaine;

/**
 * @author Marie, Camille, Kenzy
 * 
 *         Classe CompteEpargne, h�ritant de la classe abstraite Compte
 */

public class CompteEpargne extends Compte {

	/** client propri�taire du compte */
	private Client clientEpargne;

	/**
	 * Constructeur vide de la classe CompteEpargne
	 */
	public CompteEpargne() {
		super();
	}

	/**
	 * Constructeur de la classe CompteEpargne
	 * 
	 * @param clientEpargne
	 *            : client propri�taire du compte
	 */
	public CompteEpargne(Client clientEpargne) {
		super();
		this.clientEpargne = clientEpargne;
	}

	/**
	 * Constructeur de la classe CompteEpargne
	 * 
	 * @param numero
	 *            : num�ro du compte
	 * @param solde
	 *            : solde du compte
	 * @param dateOuverture
	 *            : date d'ouverture du compte
	 * @param autorisationDecouvert
	 *            : montant du d�couvert autoris� du compte courant
	 */
	public CompteEpargne(int numero, double solde, String dateOuverture, double tauxRemuneration,
			double autorisationDecouvert) {
		super(numero, solde, dateOuverture, tauxRemuneration, autorisationDecouvert);
	}

	// Getters & Setters
	public Client getClientEpargne() {
		return clientEpargne;
	}

	public void setClientEpargne(Client clientEpargne) {
		this.clientEpargne = clientEpargne;
	}

}