package enzo.atelier1.exercice2;

import java.util.Random;

public class EntierFou extends Entier {
	private static Random r = new Random();
	
	public EntierFou(int entier, int borneInf, int borneSup) {
		super(entier, borneInf, borneSup);
		// TODO Auto-generated constructor stub
	}

	public EntierFou(int borneInf, int borneSup) {
		super(borneInf, borneSup);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void increment(int niveauDeFolie) {
		super.increment(r.nextInt(niveauDeFolie+1));
	}
}
