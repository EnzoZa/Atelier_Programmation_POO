package enzo.TpCollection.exercice5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Adresse a_p1 = new Adresse("20240","Ghisonaccia");

        GregorianCalendar Enzo_d = new GregorianCalendar(2000,9,30);
        Personne Enzo = new Personne("Zampaglione", "Enzo", Enzo_d, a_p1);

        GregorianCalendar Thomas_d = new GregorianCalendar(2000,6,30);
        Personne Thomas = new Personne("Motbal", "Thomas", Thomas_d, a_p1);

        GregorianCalendar Diego_d = new GregorianCalendar(1964,9,3);
        Personne Diego = new Personne("Grante", "Diego", Diego_d, a_p1);

        GregorianCalendar Vincent_d = new GregorianCalendar(1998,6,30);
        Personne Vincent = new Personne("Bonnemayre", "Vincent", Vincent_d, a_p1);

        GregorianCalendar Fabien_d = new GregorianCalendar(1694,9,2);
        Personne Fabien = new Personne("Lai", "Fabien", Fabien_d, a_p1);

        GregorianCalendar Alexandre_d = new GregorianCalendar(2000,6,30);
        Personne Alexandre = new Personne("Motbal", "Alexandre", Alexandre_d, a_p1);

        GregorianCalendar Dominique_p1 = new GregorianCalendar(2002,9,30);
        Personne Dominique = new Personne("Zampaglione", "Dominique", Dominique_p1, a_p1);

        GregorianCalendar Sandra_p1 = new GregorianCalendar(1996,6,12);
        Personne Sandra = new Personne("Crestia", "Sandra", Sandra_p1, a_p1);

        ArrayList<Personne> listeP = new ArrayList<Personne>();
        listeP.add(Enzo);
        listeP.add(Thomas);
        listeP.add(Diego);
        listeP.add(Vincent);
        listeP.add(Fabien);
        listeP.add(Alexandre);
        listeP.add(Dominique);
        listeP.add(Sandra);
        listePersonne listePerso = new listePersonne(listeP);

        System.out.println(listePerso.sortPersonne());

    }
}
