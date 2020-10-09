package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;

public abstract class Forme2D extends Forme{

    abstract double perimetre(Forme f);

    public Forme2D(){super();}
    public Forme2D(String nom) {super(nom);}
}
