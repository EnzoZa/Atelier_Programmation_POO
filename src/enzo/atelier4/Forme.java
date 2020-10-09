package enzo.atelier4;

import java.util.Objects;

public abstract class Forme {
    private static int instance = 0;
    public String identifiant = getIdentifiant();
    private String nom = "Forme";

    protected abstract double surface(Forme f);
    public abstract String toString();

    public Forme(){
        this.identifiant = "_n";
        this.instance+=1;
        this.identifiant = nom + identifiant + instance;
    }

    public Forme(String nom){
        this.nom = nom;
        this.identifiant = "_n";
        this.instance+=1;
        this.identifiant = nom + identifiant + instance;
    }

    private String getIdentifiant() {
        return identifiant;
    }

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
