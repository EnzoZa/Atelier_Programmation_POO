package enzo.atelier6.De;

import enzo.atelier1.exercice1.DeMemoire;
import enzo.atelier1.exercice1.DePipe;
import enzo.atelier1.exercice1.DeSpeciaux;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		De de = null;
		De de2 = null;
		De enzo = null;
		try {
			de = new De(3);
			de2 = new De();
			enzo = new De(6, "Enzo");
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}
