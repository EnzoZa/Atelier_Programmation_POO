package enzo.atelier4.forme3d;
import enzo.atelier4.Forme;

public class Cylindre extends Forme3D {
    private float rayon;
    private float hauteur;
    private String nom;

    public Cylindre(float rayon, float hauteur) {
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public Cylindre(String nom, float rayon, float hauteur) {
        this.nom = nom;
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double surface(Forme f){
        return(2*Math.PI*rayon*(hauteur + rayon));
    }

    public double volume(Forme f){
        return(Math.PI*rayon*rayon*hauteur);
    }

    public String toString() {
        return("Votre cylindre " + identifiant + " à une surface de " + surface(this) +
                " et à un volume de " + volume(this));
    }

    protected String getIdentifiant(){
        instance+=1;
        nom = "Cylindre";
        return nom + "_n"+ instance;
    }

}
