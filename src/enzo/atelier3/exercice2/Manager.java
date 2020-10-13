package enzo.atelier3.exercice2;

import java.util.GregorianCalendar;

import enzo.atelier3.exercice1.Adresse;

/**
 * Classe Manager descendant de employe servant à modeliser les informations contenues dans un manager
 * @author zampaglione_e
 *
 */

public class Manager extends Employe {
	protected Secretaire secretaire;
	
	/** Construction d'un manager
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param dateNaissance la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 * @param salaire
	 * @param dateEmbauche
	 * @param secretaire
	 */
	private Manager(String leNom,String lePrenom, GregorianCalendar dateNaissance, Adresse lAdresse,
			float salaire, GregorianCalendar dateEmbauche, Secretaire secretaire) {
		super(leNom,lePrenom, dateNaissance, lAdresse, salaire, dateEmbauche);
		// TODO Auto-generated constructor stub
		if (secretaire.sizeListeManager() < 5) {
			this.secretaire = secretaire;
			secretaire.addManager(this);
		}
		else {
			System.err.println("Cette secretaire ne peux plus gerer de manager");
		}
	}
	
	/** Construction d'un manager à l'aide du constructeur
	 * Avec vérification des champs de date pour s'assurer de son age
	 * (plus de 16 et moins de 65) et que sa date d'embauche concorde avec 
	 * sa date de naissance 
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param dateNaissance la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 * @param salaire
	 * @param dateEmbauche
	 * @param secretaire
	 * @return un Manager si les conditions sont respectees sinon null
	 */
	public static Manager createManager(String leNom,String lePrenom, GregorianCalendar dateNaissance, Adresse lAdresse,
			float salaire, GregorianCalendar dateEmbauche, Secretaire secretaire) {
		Manager temp;
		if (verifAgeValide(dateEmbauche,dateNaissance)) {
			temp = new Manager(leNom,lePrenom, dateNaissance, lAdresse, salaire, dateEmbauche, secretaire);
		} else {
			temp = null;
		}
		return temp;
	}

	/** Redéfintion de toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return (super.toString() + "\nEst un manager qui touche " + salaire + " ,il travail dans l'entreprise depuis " + calculAnnuite()
				+ " et sa secretaire est " + secretaire.getNom() + " " + secretaire.getPrenom());
	}

	/**Change de secretaire
	 * supprime le manager de la liste du secretaire
	 * et change la secretaire du manager
	 * @param secretaire
	 */
	public void changeSecretaire(Secretaire secretaire) {
		secretaire.delManager(this);
		this.secretaire = secretaire;
	}
	
	/** Augmentation du salaire d'un pourcent mis en parametre
	 * Verification du pourcentage pour s'assurer qu'il est supérieur à 0
	 * @param pourcent
	 */
	@Override
	public void augmenterSalaire(float pourcent) {
		if (pourcent > 0) {
			this.salaire = salaire * (((pourcent + (0.5 * calculAnnuite())) / 100) + 1);
		}
	}
}
