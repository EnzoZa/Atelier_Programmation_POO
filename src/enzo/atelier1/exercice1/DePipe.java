package enzo.atelier1.exercice1;
/**
 * Classe DePipe servant à modeliser les informations contenues dans un Dé pipé
 * @author zampaglione_e & motbal_t
 *
 */
public class DePipe extends De {
	private int borneMin = 1;

	/**
	 * Constructeur d'un dé pipé avec vérification de la borne minimal
	 * @param borneMin
	 */
	public DePipe(int borneMin) {
		super();
		setBorneMin(borneMin);
	}

	/**
	 * Constructeur d'un dé pipé avec vérification du nombre de face et de la borne minimal
	 * @param nbFaces
	 * @param borneMin
	 */
	public DePipe(int nbFaces,int borneMin) {
		super(nbFaces);
		setBorneMin(borneMin);
	}

	/**
	 * Constructeur d'un dé pipé avec vérification du nom et de la borne minimal
	 * @param borneMin
	 * @param nom
	 */
	public DePipe(int borneMin, String nom) {
		super(nom);
		setBorneMin(borneMin);
	}

	/**
	 * Constructeur d'un dé pipé avec vérification du nombre de face, du nom et de la borne minimal
	 * @param nbFaces
	 * @param borneMin
	 * @param nom
	 */
	public DePipe(int nbFaces, int borneMin, String nom) {
		super(nbFaces,nom);
		setBorneMin(borneMin);
	}

	/**
	 * Donne la valeur minimal possible du dé
	 * @param borneMin
	 */
	private void setBorneMin(int borneMin) {
		if(borneMin < nbFaces) {
			this.borneMin = borneMin;
		}
		else {
			System.err.println("Votre d� ne sera pas pip�e car la valeur rentr� est incorrect");
		}
	}
	/**
	 * Lance le dé pipé
	 * @return la valeur du dé
	 */
	@Override
	public int lancer() {
		int result = r.nextInt(nbFaces + 1 - borneMin) + borneMin;
		return result;
	}
	/**
	 * Lance le dé pipé (nbLancer) fois
	 * @return les valeurs du dé
	 */
	@Override
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
