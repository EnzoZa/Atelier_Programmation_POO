package enzo.atelier4.forme3d;
import enzo.atelier4.Forme;
public class Forme3D extends Forme{

    public Forme3D(String nom, float longueur, float largeur, float hauteur) {
        super(nom, longueur, largeur, hauteur);
    }

    abstract volume(Forme f){}
}
