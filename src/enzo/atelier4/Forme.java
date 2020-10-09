package enzo.atelier4;

import java.util.Objects;

public class Forme {
    private static int instance = 0;
    public String identifiant = "_n";
    private float longueur;
    private float largeur;
    private float hauteur;

    /**
     * @return retourne l'identifiant
     */

    private String nom = "Forme";

    public Forme(String nom, float longueur, float largeur, float hauteur){
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        instance+=1;
        identifiant = nom + identifiant + instance;
    }

    public float surface(Forme f){
        return 2*(f.largeur*f.longueur + f.largeur*f.hauteur + f.longueur*f.hauteur)
    }

    public boolean plusGrandSurface(Forme f){
        return (surface(this)>surface(f))
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Forme)) return false;
        Forme forme = (Forme) o;
        return Float.compare(forme.longueur, longueur) == 0 &&
                Float.compare(forme.largeur, largeur) == 0 &&
                Float.compare(forme.hauteur, hauteur) == 0;
    }
}
