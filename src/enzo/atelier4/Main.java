package enzo.atelier4;
import enzo.atelier4.forme2d.*;
import enzo.atelier4.forme3d.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Forme> tabForme = new ArrayList<>();
        Ellipse f = new Ellipse(10,10);
        Cylindre f2 = new Cylindre(10,10);
        tabForme.add(f);
        tabForme.add(f2);
        System.out.println(Forme.plusGrandSurface(f,f2));
        for(Forme i : tabForme){
            System.out.println(i.surface());
        }
    }
}
