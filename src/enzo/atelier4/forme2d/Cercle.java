package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;

import java.util.Objects;

/**
 * Classe Cercle servant à modeliser les informations contenues dans un Cercle
 * @author zampaglione_e
 *
 */
public class Cercle extends Forme2D {
    private float rayon;

    /**
     * Construction d'un cercle
     * @param rayon
     */
    public Cercle(float rayon) {
        this.rayon = rayon;
    }

    /**
     * @return la surface du cercle
     */
    public double surface(){
        return(Math.PI*rayon*rayon);
    }

    /**
     * @return le perimetre du cercle
     */
    public double perimetre(){
        return(2*Math.PI*rayon);
    }

    /**
     * @return l'identifiant du cercle
     */
    protected String getIdentifiant(){
        instance+=1;
        return "Cercle" + "_n" + instance;
    }

    /** Redéfintion de toString
     * @see java.lang.Object#toString()
     */
        @Override
    public String toString() {
        return("Votre cercle " + identifiant + " à une surface de " + this.surface() +
                " et à un perimetre de " + this.perimetre());
    }

    /** Redéfintion de equals
     * @see java.lang.Object#equals()
     */
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cercle)) return false;
        Cercle cercle = (Cercle) o;
        return Float.compare(cercle.rayon, rayon) == 0;
    }
}
