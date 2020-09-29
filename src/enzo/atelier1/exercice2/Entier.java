package enzo.atelier1.exercice2;


public class Entier {
	private int borneInf;
	private int borneSup;
	private int entier;
	
	public Entier(int entier,int borneInf, int borneSup) {
		this.borneInf = borneInf;
		this.borneSup = borneSup;
		setEntier(entier);
	}
	
	public Entier(int borneInf, int borneSup) {
		this.borneInf = borneInf;
		this.borneSup = borneSup;
	}
	
	public int getBorneInf() {
		return borneInf;
	}
	
	public int getBorneSup() {
		return borneSup;
	}
	
	public void setEntier(int entier) {
		if((borneInf <= this.entier  && this.entier <= borneSup) || this.entier == 0) {
			this.entier = entier;
		}
	}
	
	public String toString() {
		return this.entier + " est l'entier situer entre " + this.borneInf + " et " + this.borneSup;
	}
	
	public boolean equals(Entier entier) {
		boolean result = false;
		if(this.entier == entier.entier) {
			result = true;
		}
		return result;
	}
	
	public void increment() {
		if(borneInf < this.entier && this.entier < borneSup){
			this.entier += 1;
		}
	}
	
	public void increment(int n) {
		if(borneInf-n < this.entier && this.entier < borneSup-n){
			this.entier += n;
		}
	}
	
}
