package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;

import java.util.Objects;

/**
 * Classe Ellipse servant à modeliser les informations contenues dans une Ellipse
 * @author zampaglione_e
 *
 */
public class Ellipse extends Forme2D {
    private float longueur;
    private float largeur;
    private float demi_largeur;
    private float demi_longueur;

    /**
     * Construction d'une ellipse
     * @param longueur
     * @param largeur
     */
    public Ellipse(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.demi_largeur = (this.largeur/2);
        this.demi_longueur = (this.longueur/2);
    }

    /**
     * @return la surface de l'ellipse
     */
    public double surface(){
        return(Math.PI*demi_longueur*demi_largeur);
    }

    /**
     * @return le perimetre de l'ellipse
     */
    public double perimetre(){
        return(2*Math.PI*(Math.sqrt((demi_longueur*demi_largeur)/2)));
    }

    /**
     * @return l'identifiant de l'ellipse
     */
    protected String getIdentifiant(){
        instance+=1;
        return "Ellipse" + "_n" + instance;
    }

    /** Redéfintion de toString
     * @see java.lang.Object#toString()
     */
        @Override
    public String toString() {
        return("Votre ellipse " + identifiant + " à une surface de " + this.surface() +
                " et à un perimetre de " + this.perimetre());
    }

    /** Redéfintion de equals
     * @see java.lang.Object#equals()
     */
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ellipse)) return false;
        Ellipse ellipse = (Ellipse) o;
        return Float.compare(ellipse.longueur, longueur) == 0 &&
                Float.compare(ellipse.largeur, largeur) == 0;
    }
}
