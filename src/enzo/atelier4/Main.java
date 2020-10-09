package enzo.atelier4;

public class Main {

    public static void main(String[] args) {
        Forme f = new Forme("enzo");
        System.out.println(f.identifiant);
        f.identifiant = "coucou";
        System.out.println(f.identifiant);
        Forme f2 = new Forme("Zozo");
        System.out.println(f2.identifiant);
    }

}
