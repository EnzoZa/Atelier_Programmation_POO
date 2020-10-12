package enzo.atelier3.exercice1;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse a_p1 = new Adresse("20240","Ghisonaccia");
		Adresse a_p2 = new Adresse("20243","Abbazia");
		GregorianCalendar b_p1 = new GregorianCalendar(2000,9,30);
		GregorianCalendar b_p2 = new GregorianCalendar(2000,9,06);
		GregorianCalendar Enzo2 = new GregorianCalendar(2000,9,30);
		Personne Enzo = new Personne("Zampaglione", "Enzo", b_p1, a_p1);
		Personne EnzoBis = new Personne("Zampaglione", "Enzo", Enzo2, a_p2);
		Personne Thomas = new Personne("Motbal", "Thomas", b_p2, a_p2);
		System.out.println(Enzo);
		System.out.println(Thomas);
		System.out.println(Thomas.plusAgeeQue(Enzo));
		System.out.println(Enzo.equals(EnzoBis));
		
	}

}
