package enzo.atelier3.exercice1;

import java.util.*;


public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
    private static int personneInstance = 1;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		personneInstance ++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Accesseur
	 * @return retourne ne nombre de personne existante dans cette instance 
	 */
	public int getNbPersonne() {
		return personneInstance;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Pr�nom : "+prenom+"\n"+
		"N�(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals()
	 */
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Personne) {
			if(((Personne) obj).getNom().equals(this.nom) && ((Personne) obj).getPrenom().equals(this.prenom) && ((Personne) obj).getDateNaissance().equals(this.dateNaissance)) {
				result = true;
			}
		}
		return result;
	}
	/*
	public int getAge(Personne p) {
		GregorianCalendar today = new GregorianCalendar();
		int age = today.get(Calendar.YEAR) - p.dateNaissance.get(Calendar.YEAR);
		if(today.getTimeInMillis() < p.dateNaissance.getTimeInMillis()) {
	        age--;
		}
		return age ;
	}
	
	public static boolean plusAgee(Personne p1, Personne p2) {
		boolean result = false;
		GregorianCalendar today = new GregorianCalendar();
		int age_p1 = getAge(p1);
		int age_p2 = getAge(p2);
		
		if(age_p1 < age_p2) {
			result = true;
		}
		else if (age_p1==age_p2) {
			float age_p1InMillis =  p1.dateNaissance.getTimeInMillis();
			float age_p2InMillis = p2.dateNaissance.getTimeInMillis();
			if(age_p1InMillis>age_p2InMillis){
				result = true;
			}
		}
		return result;
	}
	*/
	
	/** 
	 * Constructeur de Personne
	 * @param p1 une Personne
	 * @param p2 une Personne
	 * @return True si p1 est plus agee que p2, False dans la cas contraire
	 */
	public static boolean plusAgee(Personne p1, Personne p2) {
		return p1.dateNaissance.after(p2.dateNaissance);
	}
	
	/** 
	 * Constructeur de Personne
	 * @param p une Personne
	 * @return True si l'instance actuelle est plus agee que p, False dans la cas contraire
	 */
	public boolean plusAgeeQue(Personne p) {
		return plusAgee(p, this);
	}
}

    
   
   