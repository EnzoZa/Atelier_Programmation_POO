package enzo.atelier1.exercice1;

import java.util.ArrayList;
/**
 * Classe DeSpeciaux servant à modeliser les informations contenues dans un Dé spécial
 * @author zampaglione_e & motbal_t
 *
 */
public class DeSpeciaux extends De{
	private ArrayList<String> valuesFaces = new ArrayList<>();

	/**
	 * Constructeur d'un dé spécial
	 */
	public DeSpeciaux() {
		super();
		// TODO Auto-generated constructor stub
		setValuesFacesByDefault();
	}

	/**
	 * Constructeur d'un dé spécial avec vérification du nombre de face et du nom
	 * @param valuesFaces
	 * @param nom
	 */
	public DeSpeciaux(ArrayList<String> valuesFaces, String nom) {
		super(nom);
		if(3<=valuesFaces.size() && valuesFaces.size()<=120) {
			this.valuesFaces = valuesFaces;
		}
		else {
			System.err.println("Les faces de vos d�s ne sont pas valides (Trop/Pas assez de faces");
		}
	}

	/**
	 * Constructeur d'un dé spécial avec vérification du nombre de face
	 * @param valuesFaces
	 */
	public DeSpeciaux(ArrayList<String> valuesFaces) {
		if(3<=valuesFaces.size() && valuesFaces.size()<=120) {
			this.valuesFaces = valuesFaces;
		}
		else {
			System.err.println("Les faces de vos d�s ne sont pas valides (Trop/Pas assez de faces");
		}
	}

	/**
	 * Constructeur d'un dé spécial avec vérification du nom
	 */
	public DeSpeciaux(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
		setValuesFacesByDefault();
	}

	/**
	 * Valeur par défaut du dé
	 */
	private void setValuesFacesByDefault(){
		valuesFaces.add("Gagn�");
		valuesFaces.add("Perdu");
		valuesFaces.add("Relancez");
		valuesFaces.add("Passez votre tour");
	}

	/**
	 * Lance le dé spécial
	 * @return la valeur du dé
	 */
	public String lancerSpecial() {
		int i = r.nextInt(valuesFaces.size());
		return valuesFaces.get(i);
	}

}
