package enzo.atelier4;

import java.util.Objects;
import enzo.atelier4.forme2d.*;
import enzo.atelier4.forme3d.*;

public abstract class Forme {
    protected static int instance = 0;
    public final String identifiant = getIdentifiant();

    protected abstract String getIdentifiant();
    protected abstract double surface(Forme f);
    public abstract String toString();

    public boolean plusGrandSurface(Forme f){
        return (surface(this)>surface(f));
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
