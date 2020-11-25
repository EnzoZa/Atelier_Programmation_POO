package enzo.TP1.exercice2;

import java.util.Objects;

public class Citerne {
    private static int totalCiterne;
    private final int index;
    private final float capacite; //>0 <20 000
    private enum TypeLiquide typeLiquide;
    private YearMonth dateCreation;
    private float quantiteLiquide;
    private boolean propre;

    public Citerne(float capacite, YearMonth dateCreation, enum TypeLiquide typeLiquide, float quantiteLiquide){
        if(checkCapacite(capacite) && checkQuantite(quantiteLiquide)){
            totalCiterne += 1;
            index = totalCiterne;
            this.quantiteLiquide = quantiteLiquide;
            this.typeLiquide = typeLiquide;
            this dateCreation = dateCreation;
            this.propre = false;
        }
        else{
            this.capacite = 0;
            System.err.println("Votre capacite ou votre quantité de liquide est incorrect");
        }
    }

    public Citerne(float capacite, enum TypeLiquide typeLiquide, float quantiteLiquide){
        Citerne(capacite, YearMonth.now(), typeLiquide, quantiteLiquide);
    }

    public Citerne(float capacite, float quantiteLiquide){
        Citerne(capacite, YearMonth.now(), enum TypeLiquide typeLiquide.VIDE, quantiteLiquide);
    }

    public Citerne(float capacite){
        Citerne(capacite, YearMonth.now(), enum TypeLiquide typeLiquide.VIDE, 0);
        this.propre = true;
    }

    //Gerer exceptions
    private boolean checkCapacite(float capacite){
        boolean result = false;
        if(0<capacite<20 000){
            result = true;
            this.capacite = capacite;
        }
        return result;
    }

    //Gerer exceptions
    private boolean checkQuantite(float quantiteLiquide){
        boolean result = false;
        if(0<quantiteLiquide<=capacite){
            result = true;
        }
        return result;
    }

    public void nettoyage(){
        this.propre = true;
        this.quantiteLiquide = 0;
        this.typeLiquide = typeLiquide.VIDE;
    }

    public void changerTypeLiquide(enum TypeLiquide typeLiquide){
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
                ", capacite : " + capacite + " m3"
                ", mise en service : " + dateCreation +
                ", volume occupé : " + quantiteLiquide;
    }

    public void ajouterLiquide(enum TypeLiquide typeLiquide, int quantiteAjouter) {
        if(typeLiquide != this.typeLiquide && propre == false) {
            System.out.println("Impossible d'ajouter un contenu différent sans avoir une cuve propre");
        }else { //remplit
            this.typeLiquide = typeLiquide;
            int quantiteRestant = capacite - quantiteLiquide;
            if(quantiteAjouter <= quantiteRestant) {
                quantiteLiquide += quantiteAjouter;
            }else {
                quantiteLiquide = capacite;
                System.out.println("Désolé le volume que vous souhaitez ajouter est trop haut");
                System.out.println("Nous avons remplis votre cuve au maximum" + (quantiteAjouter-quantiteRestant) + "n'a pas été ajouté");
            }
            this.propre = false;
        }
    }

    public void enleverLiquide(int quantiteEnlenver) {
        if(quantiteEnlenver > this.quantiteLiquide) {// à ajouter dans class exception
            System.out.println("Volume à enlever trop élévé... Vidangeage de la cuve ");
            quantiteLiquide = 0;
        }else {
            quantiteLiquide -= quantiteEnlenver;
            System.out.println("done..");
        }
    }
}
