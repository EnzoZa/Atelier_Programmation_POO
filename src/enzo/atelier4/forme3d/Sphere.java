package enzo.atelier4.forme3d;
import enzo.atelier4.Forme;

public class Sphere extends Forme3D {
    private float rayon;
    protected String nom = "Sphere";

    public Sphere(float rayon) {
        this.rayon = rayon;
    }

    public Sphere(String nom, float rayon) {
        this.nom = nom;
        this.rayon = rayon;
    }

    public double surface(Forme f){
        return(4*Math.PI*rayon*rayon);
    }

    public double volume(Forme f){
        return((4/3)*(Math.PI*rayon*rayon*rayon));
    }

    @Override
    public String toString() {
        return("Votre sphere " + identifiant + " à une surface de " + surface(this) +
        " et à un volume de " + volume(this));
    }

    protected String getIdentifiant(){
        this.instance+=1;
        return nom + "_n"+ instance;
    }
}
