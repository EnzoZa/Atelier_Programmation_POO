package enzo.atelier1.exercice1;


import java.util.*;
//Voir correction de Ghi pour les constructeurs
public class De {
	protected static Random r = new Random();
	protected int nbFaces = 6;
	private static int i = 1;
	private String nom = "D� n�" + i;
	
	public De(int nbFaces, String nom) {
		setNbFaces(nbFaces);
		setNom(nom);
		i++;
	}
	
	public De(int nbFaces) {
		setNbFaces(nbFaces);
		i++;
	}
	
	public De(String nom) {
		setNom(nom);
		i++;
	}
	
	public De() {
		i++;
	}
	
	public int getNbFaces() {
		return nbFaces;
	}
	
	public void setNbFaces(int nbFaces) {
		if(3 <= nbFaces && nbFaces <= 120) {
			this.nbFaces = nbFaces; 
		}
		else {
			System.err.println("Le nombre de face est incoh�rent");
		}
	}
	
	public void setNom(String nom) {
		if(nom.length()!=0) {
			this.nom= nom;
		}
		else {
			System.err.println("Votre nom ne");
		}
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getNbDe() {
		return i;
	}
	
	public String toString() {
		return this.nom + " � " + this.nbFaces + " faces";
	}
	
	public boolean equals(De de) {
		boolean result = false;
		if(this.nbFaces == de.nbFaces) {
			result = true;
		}
		return result;
	}
	
	public int lancer() {
		int result = r.nextInt(nbFaces)+1;
		return result;
	}
	
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
