package enzo.atelier3.exercice2;

import java.util.Calendar;
import java.util.GregorianCalendar;

import enzo.atelier3.exercice1.Adresse;
import enzo.atelier3.exercice1.Personne;

/**
 * Classe Employe servant à modeliser les informations contenues dans un employe
 * @author zampaglione_e
 *
 */

public class Employe extends Personne{
	protected double salaire;
	private final GregorianCalendar dateEmbauche;
	
	/**Construction d'un Employe
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param dateNaissance la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 * @param salaire
	 * @param dateEmbauche
	 */
	
	protected Employe(String leNom,String lePrenom, GregorianCalendar dateNaissance, Adresse lAdresse,
			float salaire, GregorianCalendar dateEmbauche) {
		super(leNom, lePrenom, dateNaissance, lAdresse);
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
		// TODO Auto-generated constructor stub
	}
/*	
	protected Employe(float salaire, int jEmbauche, int mEmbauche, int aEmbauche, int jNaissance, int mNaissance, int aNaissance) {
		this(salaire, new GregorianCalendar(aEmbauche, mEmbauche, jEmbauche), new GregorianCalendar(aNaissance, mNaissance, jNaissance));
	}
*/	
	
	/**
	 * Construction d'un Employe
	 * Avec vérification des champs de date pour s'assurer de son age
	 * (plus de 16 et moins de 65) et que sa date d'embauche concorde avec 
	 * sa date de naissance 
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param dateNaissance la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 * @param salaire
	 * @param dateEmbauche
	 * @return un Employe si les conditions sont respectees sinon null
	 */
	public static Employe createEmploye(String leNom,String lePrenom, GregorianCalendar dateNaissance, Adresse lAdresse,
			float salaire, GregorianCalendar dateEmbauche) {
		Employe temp;
		if(verifAgeValide(dateEmbauche, dateNaissance) && salaire > 0) {
			temp = new Employe(leNom, lePrenom, dateNaissance, lAdresse, salaire, dateEmbauche);
		}
		else {
			temp = null;
		}
		return temp;
	}
	
	/** Verifie si l'age est valide (entre 16 et 65 ans)
	 * @param dateEmbauche
	 * @param dateNaissance
	 * @return true si l'age est valide sinon false
	 */
	protected static boolean verifAgeValide(GregorianCalendar dateEmbauche, GregorianCalendar dateNaissance) {
		boolean result = false;
		GregorianCalendar today = new GregorianCalendar();
		int age = today.get(Calendar.YEAR) - dateNaissance.get(Calendar.YEAR);
		if(today.getTimeInMillis() < dateNaissance.getTimeInMillis()) {
			age--;
		}
		int tempsEntreprise = today.get(Calendar.YEAR) - dateEmbauche.get(Calendar.YEAR);
		int ageRequis = age - tempsEntreprise;
		if((16<=ageRequis && ageRequis<65)) {
			result = true;
		}
		return result;
	}
	
	/**
	 * @return retourne l'age.
	 */
	public int getAge() {
		GregorianCalendar today = new GregorianCalendar();
		int age = today.get(Calendar.YEAR) - getDateNaissance().get(Calendar.YEAR);
		if(today.getTimeInMillis() < getDateNaissance().getTimeInMillis()) {
	        age--;
		}
		return age;
	}
	
	/** Red�fintion de toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return (super.toString() + "\nEst un employé qui travail dans l'entreprise depuis " + calculAnnuite() + " ans." );
	}
	
	/** Augmentation du salaire d'un pourcent mis en parametre
	 * Verification du pourcentage pour s'assurer qu'il est supérieur à 0
	 * @param pourcent
	 */
	public void augmenterSalaire(float pourcent){
		if(pourcent>0) {
			this.salaire = salaire*(pourcent/100 + 1);
		}
	}
	
	/** Calcul le temps passer dans l'entreprise
	 * On rajoute 1 ans pour compter l'année en cours
	 * @param e
	 * @return le temps passer par l'employe dans l'entreprise
	 */
	public int calculAnnuite() {
		GregorianCalendar today = new GregorianCalendar();
		int annuite = today.get(Calendar.YEAR) - dateEmbauche.get(Calendar.YEAR);
		return annuite+1;
	}
}
