package enzo.atelier1.exercice1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		De de = new De(3);
		De de2 = new De();
		De enzo = new De(6, "Enzo");
		System.out.println("Dé numéro 1 : " + de.getNbFaces());
		System.out.println("Dé numéro 2 : " + de2.getNbFaces());
		de.setNbFaces(8);
		System.out.println("New Dé numéro 1 : " + de.getNbFaces());
		de2.setNbFaces(150);
		System.out.println("Test erreur Dé numéro 2 : " + de.getNbFaces());
		System.out.println(de);
		System.out.println(de2);
		de.setNbFaces(119);
		System.out.println("20 lancer de dé ou on est censer avoir des valeurs entre [1;150]");
		System.out.println(de.lancer(20));
		System.out.println(enzo);
		System.out.println(enzo.equals(de2));
		if (enzo == de2) {
			System.out.println("Coucou");
		}
		else {
			System.out.println("Bye");
		}
		
		
		DePipe dePipe = new DePipe(6,5);
		System.out.println(dePipe);
		System.out.println(dePipe.lancer());
		
		DeMemoire deMemoire = new DeMemoire(3);
		System.out.println(deMemoire);
		for(int i=0;i<=10;i++) {
			System.out.println("Test " + i);
			deMemoire.lancer();
		}
		
		DeSpeciaux deSpecial = new DeSpeciaux();
		System.out.println(deSpecial.lancerSpecial());
	}

}
