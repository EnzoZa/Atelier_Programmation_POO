package enzo.atelier6.De;


import java.util.Random;

/**
 * Classe De servant à modeliser les informations contenues dans un Dé
 * @author zampaglione_e & motbal_t
 *
 */
public class De {
	protected static Random r = new Random();
	protected int nbFaces;
	private static int i = 0;
	private String nom;

	/**
	 * Constructeur d'un dé avec vérification du nombre de face et du nom
	 * @param nbFaces
	 * @param nom
	 */
	public De(int nbFaces, String nom) {
		i++;
		setNbFaces(nbFaces);
		setNom(nom);
	}

	/**
	 * Constucteur d'un dé avec vérification du nombre de face
	 * @param nbFaces
	 */
	public De(int nbFaces) {
		this(nbFaces, "Dé n°" + (i+1));
	}

	/**
	 * Constructeur d'un dé avec vérification du nom
	 * @param nom
	 */
	public De(String nom) {
		this(6,nom);
	}

	/**
	 * Constructeur d'un dé
	 */
	public De() {
		i++;
	}

	/**
	 * Accesseur
	 * @return le nombre de face du dé
	 */
	public int getNbFaces() {
		return nbFaces;
	}

	/**
	 * @param nbFaces le nbFaces pour l'attribution, son nbFaces doit être valide
	 *                entre 3 et 120 faces
	 */
	public void setNbFaces(int nbFaces) throws IllegalArgumentException{
		if(3 > nbFaces || nbFaces > 120) throw new IllegalArgumentException();
		else {
			this.nbFaces = nbFaces;
		}
	}

	/**
	 * @param nom le nom pour l'attribution
	 */
	public void setNom(String nom) throws IllegalArgumentException{
		if(nom.length()==0) throw new IllegalArgumentException();
		else {
			this.nom= nom;
		}
	}

	/**
	 * Accesseur
	 * @return le nom du dé
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Accesseur
	 * @return le nombre de dé existant
	 */
	public int getNbDe() {
		return i;
	}

	/** Redéfintion de toString
	 * @see Object#toString()
	 */
	public String toString() {
		return this.nom + " � " + this.nbFaces + " faces";
	}

	/** Redéfintion de equals
	 * @see Object#equals()
	 */
	public boolean equals(De de) {
		boolean result = false;
		if(this.nbFaces == de.nbFaces) {
			result = true;
		}
		return result;
	}

	/**
	 * Lance le dé
	 * @return la valeur du dé
	 */
	public int lancer() {
		int result = r.nextInt(nbFaces)+1;
		return result;
	}

	/**
	 * Lance le dé (nbLancer) fois
	 * @param nbLancer
	 * @return les valeurs du dé
	 */
	public int lancer(int nbLancer) {
		int result = 0;
		int lancer = 0;
		for(int i=0;i<=nbLancer;i++) {
			lancer = lancer();
			if(result<lancer) {
				result = lancer;
			}
		}
		return result;
	}
}
