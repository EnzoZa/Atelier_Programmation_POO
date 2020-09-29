package enzo.atelier1.exercice1;

import java.util.ArrayList;

public class DeSpeciaux extends De{
	private ArrayList<String> valuesFaces = new ArrayList<>();
	
	public DeSpeciaux() {
		super();
		// TODO Auto-generated constructor stub
		setValuesFacesByDefault();
	}

	public DeSpeciaux(ArrayList<String> valuesFaces, String nom) {
		super(nom);
		if(3<=valuesFaces.size() && valuesFaces.size()<=120) {
			this.valuesFaces = valuesFaces;
		}
		else {
			System.err.println("Les faces de vos dès ne sont pas valides (Trop/Pas assez de faces");
		}
	}

	public DeSpeciaux(ArrayList<String> valuesFaces) {
		if(3<=valuesFaces.size() && valuesFaces.size()<=120) {
			this.valuesFaces = valuesFaces;
		}
		else {
			System.err.println("Les faces de vos dès ne sont pas valides (Trop/Pas assez de faces");
		}
	}

	public DeSpeciaux(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
		setValuesFacesByDefault();
	}
	
	private void setValuesFacesByDefault(){
		valuesFaces.add("Gagné");
		valuesFaces.add("Perdu");
		valuesFaces.add("Relancez");
		valuesFaces.add("Passez votre tour");
	}
	
	public String lancerSpecial() {
		int i = r.nextInt(valuesFaces.size());
		return valuesFaces.get(i);
	}

}
