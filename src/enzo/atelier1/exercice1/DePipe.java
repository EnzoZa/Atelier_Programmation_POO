package enzo.atelier1.exercice1;


public class DePipe extends De {
	private int borneMin = 1;
	
	public DePipe(int borneMin) {
		super();
		setBorneMin(borneMin);
	}
	
	public DePipe(int nbFaces,int borneMin) {
		super(nbFaces);
		setBorneMin(borneMin);
	}
	
	public DePipe(int borneMin, String nom) {
		super(nom);
		setBorneMin(borneMin);
	}
	
	public DePipe(int nbFaces, int borneMin, String nom) {
		super(nbFaces,nom);
		setBorneMin(borneMin);
	}
	
	private void setBorneMin(int borneMin) {
		if(borneMin < nbFaces) {
			this.borneMin = borneMin;
		}
		else {
			System.err.println("Votre dé ne sera pas pipée car la valeur rentré est incorrect");
		}
	}
	@Override
	public int lancer() {
		int result = r.nextInt(nbFaces + 1 - borneMin) + borneMin;
		return result;
	}
	
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
