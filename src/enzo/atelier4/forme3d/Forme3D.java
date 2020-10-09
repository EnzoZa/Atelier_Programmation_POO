package enzo.atelier4.forme3d;
import enzo.atelier4.Forme;
public abstract class Forme3D extends Forme{

    public abstract double volume(Forme f);

    public Forme3D(){super();}
    public Forme3D(String nom) {
        super(nom);
    }
}
