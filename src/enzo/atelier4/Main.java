package enzo.atelier4;
import enzo.atelier4.forme2d.*;
import enzo.atelier4.forme3d.*;
public class Main {

    public static void main(String[] args) {
        Ellipse f = new Ellipse(10,10);
        System.out.println(f.identifiant);
        Cylindre f2 = new Cylindre("Zozo",10,10);
        System.out.println(f2.identifiant);
        System.out.println(f2);
        System.out.println(f);
    }

}
