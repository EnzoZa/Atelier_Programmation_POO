package enzo.TpCollection.exercice1;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Adresse a_p1 = new Adresse("20240","Ghisonaccia");
        GregorianCalendar b_p1 = new GregorianCalendar(2000,9,30);
        Personne Enzo = new Personne("Zampaglione", "Enzo", b_p1, a_p1);
        PaireGenerique<Integer,Personne> t1 = new PaireGenerique<Integer,Personne>(12,Enzo);
        System.out.println(t1);

        PaireGenerique<GregorianCalendar,Personne> t2 = new PaireGenerique<GregorianCalendar,Personne>(b_p1,Enzo);
        System.out.println(t2);

    }
}
