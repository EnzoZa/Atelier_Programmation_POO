package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;

public class Rectangle extends Forme2D {
    private float longueur;
    private float largeur;
    protected String nom = "Rectangle";

    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(String nom, float longueur, float largeur) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface(Forme f){
        return(longueur*largeur);
    }

    public double perimetre(Forme f){
        return(2*(longueur+largeur));
    }

    @Override
    public String toString() {
        return("Votre rectangle " + identifiant + " à une surface de " + surface(this) +
                " et à un perimetre de " + perimetre(this));
    }

    protected String getIdentifiant(){
        this.instance+=1;
        return nom + "_n"+ instance;
    }

}
