package enzo.atelier4;

import java.util.Objects;
import enzo.atelier4.forme2d.*;
import enzo.atelier4.forme3d.*;
/**
 * Classe Forme servant à modeliser les informations contenues dans une Forme
 * @author zampaglione_e
 *
 */
public abstract class Forme {
    protected static int instance = 0;
    public final String identifiant = getIdentifiant();

    protected abstract String getIdentifiant();
    public abstract double surface();
    public abstract String toString();

    public static boolean plusGrandSurface(Forme f, Forme f2){
        return (f.surface()>f2.surface());
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forme)) return false;
        Forme forme = (Forme) o;
        return Float.compare(Forme.longueur, longueur) == 0 &&
                Float.compare(Forme.largeur, largeur) == 0 &&
                Float.compare(Forme.hauteur, hauteur) == 0;
    } */
}
