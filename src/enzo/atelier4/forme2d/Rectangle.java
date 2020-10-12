package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;
/**
 * Classe Rectangle servant à modeliser les informations contenues dans un Rectangle
 * @author zampaglione_e
 *
 */
public class Rectangle extends Forme2D {
    private float longueur;
    private float largeur;

    /**
     * Construction d'un rectangle
     * @param longueur
     * @param largeur
     */
    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * @return la surface du rectangle
     */
    public double surface(){
        return(longueur*largeur);
    }

    /**
     * @return le perimetre du rectangle
     */
    public double perimetre(){
        return(2*(longueur+largeur));
    }

    /**
     * @return l'identifiant du rectangle
     */
    protected String getIdentifiant(){
        instance+=1;
        return "Rectangle" + "_n"+ instance;
    }

    /** Redéfintion de toString
     * @see java.lang.Object#toString()
     */
        @Override
    public String toString() {
        return("Votre rectangle " + identifiant + " à une surface de " + this.surface() +
                " et à un perimetre de " + this.perimetre());
    }


}
