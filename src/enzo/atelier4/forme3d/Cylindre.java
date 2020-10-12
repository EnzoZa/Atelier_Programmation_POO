package enzo.atelier4.forme3d;
import enzo.atelier4.Forme;
/**
 * Classe Cylindre servant à modeliser les informations contenues dans un Cylindre
 * @author zampaglione_e
 *
 */
public class Cylindre extends Forme3D {
    private float rayon;
    private float hauteur;

    /**
     * Construction d'un cylindre
     * @param rayon
     * @param hauteur
     */
    public Cylindre(float rayon, float hauteur) {
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    /**
     * @return la surface du cylindre
     */
    public double surface(){
        return(2*Math.PI*rayon*(hauteur + rayon));
    }

    /**
     * @return le volume du cylindre
     */
    public double volume(){
        return(Math.PI*rayon*rayon*hauteur);
    }

    /**
     * @return l'identifiant du cylindre
     */
    protected String getIdentifiant(){
        instance+=1;
        return "Cylindre" + "_n"+ instance;
    }

    /** Redéfintion de toString
     * @see java.lang.Object#toString()
     */
        @Override
    public String toString() {
        return("Votre cylindre " + identifiant + " à une surface de " + this.surface() +
                " et à un volume de " + this.volume());
    }

}
