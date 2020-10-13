package enzo.atelier4.forme3d;
import enzo.atelier4.Forme;

import java.util.Objects;

/**
 * Classe Sphere servant à modeliser les informations contenues dans une Sphere
 * @author zampaglione_e
 *
 */
public class Sphere extends Forme3D {
    private float rayon;

    /**
     * Construction d'une sphere
     * @param rayon
     */
    public Sphere(float rayon) {
        this.rayon = rayon;
    }

    /**
     * @return la surface de la sphere
     */
    public double surface(){
        return(4*Math.PI*rayon*rayon);
    }

    /**
     * @return le volume de la sphere
     */
    public double volume(){
        return((4/3)*(Math.PI*rayon*rayon*rayon));
    }

    /**
     * @return l'identifiant de la sphere
     */
    protected String getIdentifiant(){
        instance+=1;
        return "Sphere" + "_n"+ instance;
    }

    /** Redéfintion de toString
     * @see java.lang.Object#toString()
     */
        @Override
    public String toString() {
        return("Votre sphere " + identifiant + " à une surface de " + this.surface() +
        " et à un volume de " + this.volume());
    }

    /** Redéfintion de equals
     * @see java.lang.Object#equals()
     */
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sphere)) return false;
        Sphere sphere = (Sphere) o;
        return Float.compare(sphere.rayon, rayon) == 0;
    }
}
