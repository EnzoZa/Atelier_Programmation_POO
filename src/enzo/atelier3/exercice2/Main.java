package enzo.atelier3.exercice2;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import enzo.atelier3.exercice1.Adresse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse a_p1 = new Adresse("20240","Ghisonaccia");
		Adresse a_p2 = new Adresse("20243","Abbazia");
		GregorianCalendar dateEmbauche = new GregorianCalendar(2016,9,28);
		GregorianCalendar dateNaissance = new GregorianCalendar(2000,9,30);
		Employe e = Employe.createEmploye("Zampaglione", "Enzo", dateNaissance, a_p1, 1600, dateEmbauche);
		System.out.println(e);
		e.augmenterSalaire(50);
		System.out.println(e);
		
		GregorianCalendar dateEmbaucheManager = new GregorianCalendar(2010,9,28);
		GregorianCalendar dateNaissanceManager = new GregorianCalendar(1980,9,30);
		Secretaire secretaire = Secretaire.createSecretaire("Oui", "Lea",  dateNaissance, a_p1, 1200, dateEmbauche);	
		
		System.out.println(secretaire);
		
		Manager m = Manager.createManager("Grante", "Diego",  dateNaissanceManager, a_p1, 1600, dateEmbaucheManager, secretaire);
		
		System.out.println(m);

		m.augmenterSalaire(50);
		
		System.out.println(m);
		
		System.out.println(secretaire);
		
		secretaire.augmenterSalaire(20);
		
		System.out.println(secretaire);
	
		Manager m1 = Manager.createManager("Motbal", "Thomas", dateNaissance, a_p1, 1600, dateEmbauche, secretaire);
		
		Manager m2 = Manager.createManager("Motbal", "Alex", dateNaissance, a_p1, 1600, dateEmbauche, secretaire);
	
		Manager m3 = Manager.createManager("G", "Jeff", dateNaissance, a_p1, 1600, dateEmbauche, secretaire);
		
		System.out.println(secretaire);
	}

}
