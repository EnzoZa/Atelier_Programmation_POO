package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;

public class Forme2D extends Forme{

    public Forme2D(String nom, float longueur, float largeur, float hauteur) {
        super(nom, longueur, largeur, hauteur);
    }

    abstract float perimetre(Forme f){}
}
