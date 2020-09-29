package enzo.atelier1.exercice1;

public class DeMemoire extends De {
	private int valeurDe;
	

	public DeMemoire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeMemoire(int nbFaces, String nom) {
		super(nbFaces, nom);
		// TODO Auto-generated constructor stub
	}

	public DeMemoire(int nbFaces) {
		super(nbFaces);
		// TODO Auto-generated constructor stub
	}

	public DeMemoire(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public int getValeurDe() {
		return valeurDe;
	}
	
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
