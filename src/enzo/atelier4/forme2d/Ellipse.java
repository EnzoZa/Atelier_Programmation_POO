package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;

public class Ellipse extends Forme2D{
    private float longueur;
    private float largeur;
    private float demi_largeur;
    private float demi_longueur;
    private String nom = "Ellipse";

    public Ellipse(float longueur, float largeur) {
        super();
        this.longueur = longueur;
        this.largeur = largeur;
        this.demi_largeur = (this.largeur/2);
        this.demi_longueur = (this.longueur/2);
    }

    public Ellipse(String nom, float longueur, float largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
        this.demi_largeur = (this.largeur/2);
        this.demi_longueur = (this.longueur/2);
    }

    public double surface(Forme f){
        return(Math.PI*demi_longueur*demi_largeur);
    }

    public double perimetre(Forme f){
        return(2*Math.PI*(Math.sqrt((demi_longueur*demi_largeur)/2)));
    }

    @Override
    public String toString() {
        return("Votre ellipse " + identifiant + " à une surface de " + surface(this) +
                " et à un perimetre de " + perimetre(this));
    }
}
