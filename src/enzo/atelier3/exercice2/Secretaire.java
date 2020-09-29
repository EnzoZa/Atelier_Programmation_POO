package enzo.atelier3.exercice2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import enzo.atelier3.exercice1.Adresse;

/**
 * Classe Secretaire descendant de employe servant � modeliser les informations contenues dans une secretaire
 * @author zampaglione_e
 *
 */
public class Secretaire extends Employe{
	protected ArrayList<Manager> listeManager;
	/** Construction d'une secretaire
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param dateNaissance la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 * @param salaire
	 * @param dateEmbauche
	 */
	protected Secretaire(String leNom,String lePrenom, GregorianCalendar dateNaissance, Adresse lAdresse,
			float salaire, GregorianCalendar dateEmbauche) {
		super(leNom, lePrenom, dateNaissance, lAdresse, salaire, dateEmbauche);
		// TODO Auto-generated constructor stub
		this.listeManager = new ArrayList<Manager>();
	}
	
	/*
	protected Secretaire(float salaire, GregorianCalendar dateEmbauche, GregorianCalendar dateNaissance, Manager m) {
		super(salaire, dateEmbauche, dateNaissance);
		ArrayList<Manager> listeManager = new ArrayList<Manager>();
		listeManager.add(m);
		// TODO Auto-generated constructor stub
	}
	
	protected Secretaire(float salaire, GregorianCalendar dateEmbauche, GregorianCalendar dateNaissance,ArrayList<Manager> listeManager) {
		super(salaire, dateEmbauche, dateNaissance);
		this.listeManager = listeManager;
		// TODO Auto-generated constructor stub
	}
	*/
	
	/** Construction d'une secretaire à l'aide du constructeur
	 * Avec vérification des champs de date pour s'assurer de son age
	 * (plus de 16 et moins de 65) et que sa date d'embauche concorde avec 
	 * sa date de naissance 
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param dateNaissance la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 * @param salaire
	 * @param dateEmbauche
	 * @return une secretaire si les conditions sont respectees sinon null
	 */
	public static Secretaire createSecretaire(String leNom,String lePrenom, GregorianCalendar dateNaissance, Adresse lAdresse,
			float salaire, GregorianCalendar dateEmbauche) {
		Secretaire temp;
		if(verifAgeValide(dateEmbauche,dateNaissance)) {
			temp = new Secretaire(leNom, lePrenom, dateNaissance, lAdresse, salaire, dateEmbauche);
		}
		else {
			temp = null;
		}
		return temp;
	}
	
	/** Redéfintion de toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return(getNom() + " " + getPrenom() + " est une secretaire qui touche " + salaire + " et elle a " + sizeListeManager() + " manager : " + listeManager);
	}
	
	/** Associe une secretaire à un manager
	 * ajoute le manager a la liste de la secretaire
	 * @param m
	 */
	public void addManager(Manager m) {
		if (sizeListeManager() < 5) {
			m.secretaire = this;
			listeManager.add(m);
		}
		else {
			System.err.println("Cette secretaire ne peux plus gerer de manager");
		}
	}
	/** Enleve une secretaire à un manager
	 * enleve le manager a la liste de la secretaire
	 * @param m
	 */
	public void delManager(Manager m) {
		listeManager.remove(m);
	}
	/** Donne la taille de la liste
	 * @return 0 si la liste est vide sinon sa taille
	 */
	public int sizeListeManager()
	    {
	        int result;
	        if(listeManager.isEmpty())
	        {
	            result = 0;
	        }
	        else
	        {
	            result = listeManager.size();
	        }
	        return result;
	    }
	/** Augmentation du salaire d'un pourcent mis en parametre
	 * Verification du pourcentage pour s'assurer qu'il est supérieur à 0
	 * @param pourcent
	 */
	@Override
	public void augmenterSalaire(float pourcent){
		if(pourcent>0) {
			this.salaire = salaire*(((pourcent+(0.5*listeManager.size()))/100) + 1);
		}
	}

}
