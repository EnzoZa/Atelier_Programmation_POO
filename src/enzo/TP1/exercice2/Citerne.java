package enzo.TP1.exercice2;

import enzo.TP1.exercice1.EstComparable;
import enzo.TP1.exercice1.MonTableau;
import enzo.atelier6.exercice1.FullStackException;

import java.util.Objects;
import java.time.YearMonth;

public class Citerne implements EstComparable{
    private static int totalCiterne;
    private final int index;
    protected final float capacite; // > 0 < 20 000
    public enum TypeLiquide {EAU,VIN,HUILE,VIDE}; //Type
    protected TypeLiquide typeLiquide /*= TypeLiquide.VIDE*/; //Instance
    private YearMonth dateCreation;
    protected float quantiteLiquide = 0;
    protected boolean propre;

    public Citerne(float capacite, YearMonth dateCreation, TypeLiquide typeLiquide, float quantiteLiquide) throws IllegalArgumentException{
        if((0>=capacite || capacite>20000) || (0>quantiteLiquide || quantiteLiquide>capacite) || (typeLiquide==TypeLiquide.VIDE && quantiteLiquide!=0)) throw new IllegalArgumentException("Vos arguments ne sont pas valide");
        else{
            totalCiterne += 1;
            index = totalCiterne;
            this.capacite = capacite;
            this.quantiteLiquide = quantiteLiquide;
            this.typeLiquide = typeLiquide;
            this.dateCreation = dateCreation;
            this.propre = false;
        }
        /*
        if((0<capacite && capacite<20000) && (0<=quantiteLiquide && quantiteLiquide<=capacite)){
            totalCiterne += 1;
            index = totalCiterne;
            this.capacite = capacite;
            this.quantiteLiquide = quantiteLiquide;
            this.typeLiquide = typeLiquide;
            this.dateCreation = dateCreation;
            this.propre = false;
        }
        else{
            //Exceptions
            totalCiterne += 1;
            index = totalCiterne;
            this.capacite = 10000;
            this.quantiteLiquide = 0;
            this.typeLiquide = TypeLiquide.VIDE;
            this.dateCreation = YearMonth.now();
            this.propre = true;
            System.err.println("Votre capacite ou votre quantité de liquide est incorrect");
        }
         */
    }

    public Citerne(float capacite, TypeLiquide typeLiquide, float quantiteLiquide){
        this(capacite, YearMonth.now(), typeLiquide, quantiteLiquide);
    }

    public Citerne(float capacite, float quantiteLiquide){
        this(capacite, YearMonth.now(), TypeLiquide.VIDE, quantiteLiquide);
    }

    public Citerne(float capacite){
        this(capacite, YearMonth.now(), TypeLiquide.VIDE, 0);
        this.propre = true;
    }

    /*
    //Gerer exceptions
    private boolean checkCapacite(float capacite){
        boolean result = false;
        if(0<capacite && capacite<20000){
            result = true;
            this.capacite = capacite;
        }
        return result;
    }
     */

    /*
    //Gerer exceptions
    private boolean checkQuantite(float quantiteLiquide){
        boolean result = false;
        System.out.println(capacite);
        if(0<quantiteLiquide && quantiteLiquide<=capacite){
            result = true;
        }
        return result;
    }
    */

    public void nettoyage(){
        this.propre = true;
        this.quantiteLiquide = 0;
        this.typeLiquide = typeLiquide.VIDE;
    }

    public void changerTypeLiquide(TypeLiquide typeLiquide){
        if(propre){this.typeLiquide = typeLiquide;}
        else{System.out.println("Il faut d'abord nettoyer la cuve");}
    }

    public Citerne plusAncienne(Citerne citerne1, Citerne citerne2){
        if(citerne1.dateCreation.isBefore(citerne2.dateCreation)){
            return citerne1;
        }
        else{
            return citerne2;
        }
    }

    public int nbCiterne(){
        return totalCiterne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citerne)) return false;
        Citerne citerne = (Citerne) o;
        return Float.compare(citerne.capacite, capacite) == 0 &&
                Float.compare(citerne.quantiteLiquide, quantiteLiquide) == 0 &&
                dateCreation.equals(citerne.dateCreation);
    }

    @Override
    public String toString() {
        return "Citerne n°" + index + ", " + typeLiquide +
                ", capacite : " + capacite + " m3" +
                ", mise en service : " + dateCreation +
                ", volume occupé : " + quantiteLiquide;
    }

    public void ajouterLiquide(TypeLiquide typeLiquide, float quantiteAjouter) {
        if(typeLiquide != this.typeLiquide && propre == false || quantiteAjouter < 0) {
            System.out.println("Impossible d'ajouter un contenu différent sans avoir une cuve propre");
        }else { //remplit
            this.typeLiquide = typeLiquide;
            float quantiteRestant = capacite - quantiteLiquide;
            if(quantiteAjouter <= quantiteRestant) {
                quantiteLiquide += quantiteAjouter;
            }else {
                quantiteLiquide = capacite;
                System.out.println("Désolé le volume que vous souhaitez ajouter est trop haut");
                System.out.println("Nous avons remplis votre cuve au maximum " + (quantiteAjouter-quantiteRestant) + " n'a pas été ajouté");
            }
            this.propre = false;
        }
    }

    public void enleverLiquide(float quantiteEnlever) {
        if(quantiteEnlever > this.quantiteLiquide) {// à ajouter dans class exception
            System.out.println("Volume à enlever trop élévé... Vidangeage de la cuve ");
            quantiteLiquide = 0;
            typeLiquide = TypeLiquide.VIDE;
        }else {
            quantiteLiquide -= quantiteEnlever;
            System.out.println("done..");
        }
    }

    public int compareA(Object o) throws ClassCastException{
        int result = 0;
        if(!(o instanceof Citerne)) throw new ClassCastException("Ceci n'est pas une citerne");
        else{
            Citerne c = (Citerne)o;
            if(this.quantiteLiquide>c.quantiteLiquide){
                result = 1;
            }
            else if(this.quantiteLiquide<c.quantiteLiquide){
                result = -1;
            }
        }
        return result;
    }

}
