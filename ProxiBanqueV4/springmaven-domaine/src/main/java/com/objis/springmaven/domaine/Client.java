package com.objis.springmaven.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Marie, Camille, Kenzy
 * 
 *         Classe client
 */
@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Compte courant du client */
	private CompteCourant compteCourant;

	/** Compte épargne du client */
	private CompteEpargne compteEpargne;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	/** identifiant du client */
	private int idClient;

	/** nom du client */
	private String nom;

	/** prenom du client */
	private String prenom;

	/** Adresse du client */
	private String adresse;

	/** numéro de téléphone du client */
	private int tel;

	/** adresse email du client */
	private String email;

	/** Conseiller du client */
	@ManyToOne
	Conseiller conseiller;

	/**
	 * Constructeur vide de la classe Client
	 */
	public Client() {
	}

	/**
	 * Constructeur de la classe Client
	 * 
	 * @param nom
	 *            : nom du client
	 * @param prenom
	 *            : prenom du client
	 * @param adresse
	 *            : adresse du client
	 * @param tel
	 *            : numéro de téléphone du client
	 * @param email
	 *            : adresse mail du client
	 * @param conseiller
	 *            : conseiller responsable du client
	 */
	public Client(String nom, String prenom, String adresse, int tel, String email, Conseiller conseiller) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.conseiller = conseiller;
	}

	// Getters & Setters

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

}