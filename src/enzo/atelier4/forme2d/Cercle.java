package enzo.atelier4.forme2d;
import enzo.atelier4.Forme;

public class Cercle extends Forme2D {
    private float rayon;
    protected String nom = "Cercle";

    public Cercle(float rayon) {
        this.rayon = rayon;
    }

    public Cercle(String nom, float rayon) {
        this.nom = nom;
        this.rayon = rayon;
    }

    public double surface(Forme f){
        return(Math.PI*rayon*rayon);
    }

    public double perimetre(Forme f){
        return(2*Math.PI*rayon);
    }

    public String toString() {
        return("Votre cercle " + identifiant + " à une surface de " + surface(this) +
                " et à un perimetre de " + perimetre(this));
    }

    protected String getIdentifiant(){
        this.instance+=1;
        return nom + "_n" + instance;
    }
}
