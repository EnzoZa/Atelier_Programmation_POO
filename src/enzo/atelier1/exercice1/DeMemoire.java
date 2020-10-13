package enzo.atelier1.exercice1;
/**
 * Classe DeMemoire servant à modeliser les informations contenues dans un Dé mémoire
 * @author zampaglione_e & motbal_t
 *
 */
public class DeMemoire extends De {
	private int valeurDe;

	/**
	 * Constructeur d'un dé mémoire
	 */
	public DeMemoire() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur d'un dé mémoire avec vérification du nombre de face et du nom
	 * @param nbFaces
	 * @param nom
	 */
	public DeMemoire(int nbFaces, String nom) {
		super(nbFaces, nom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur d'un dé mémoire avec vérification du nombre de face
	 * @param nbFaces
	 */
	public DeMemoire(int nbFaces) {
		super(nbFaces);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur d'un dé mémoire avec vérification du nom
	 * @param nom
	 */
	public DeMemoire(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Accesseur
	 * @return la valeur du dé
	 */
	public int getValeurDe() {
		return valeurDe;
	}

	/**
	 * Lance le dé mémoire (ne pouvant avoir 2 fois la même valeur)
	 * @return la valeur du dé
	 */
	@Override
	public int lancer() {
		int lancer;
		do{
			lancer = super.lancer();
		}
		while(lancer==valeurDe);
		valeurDe = lancer;
		return valeurDe;
	}
	
}
