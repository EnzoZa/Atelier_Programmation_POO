package enzo.TP1.exercice2;

import enzo.TP1.exercice1.EstComparable;
import enzo.TP1.exercice1.MonTableau;
import enzo.atelier5.exercice2.Mere;
import enzo.atelier5.exercice2.UneClasse;
import enzo.atelier6.exercice1.FullStackException;

import java.util.Objects;
import java.time.YearMonth;

public class Citerne implements EstComparable, Cloneable{
    private static int totalCiterne;
    private final int index;
    protected final float capacite; // > 0 < 20 000
    public enum TypeLiquide {EAU,VIN,HUILE,VIDE}; //Type
    protected TypeLiquide typeLiquide /*= TypeLiquide.VIDE*/; //Instance
    private YearMonth dateCreation;
    protected float quantiteLiquide = 0;
    protected boolean propre;

    /**
     * Constructeur d'une citerne
     * Vérifie que la capacité se trouve entre 0 et 20000m3, que la quantité liquide ne dépasse pas la capacité
     * Et que si la quantité liquide est à 0 alors le type de liquide doit être VIDE
     * @param capacite
     * @param dateCreation
     * @param typeLiquide
     * @param quantiteLiquide
     * @throws IllegalArgumentException
     */
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
    }

    /**
     * Constructeur d'une citerne
     * @param capacite
     * @param typeLiquide
     * @param quantiteLiquide
     */
    public Citerne(float capacite, TypeLiquide typeLiquide, float quantiteLiquide){
        this(capacite, YearMonth.now(), typeLiquide, quantiteLiquide);
    }

    /**
     * Constructeur d'une citerne
     * @param capacite
     * @param quantiteLiquide
     */
    public Citerne(float capacite, float quantiteLiquide){
        this(capacite, YearMonth.now(), TypeLiquide.VIDE, quantiteLiquide);
    }

    /**
     * Constructeur d'une citerne
     * @param capacite
     */
    public Citerne(float capacite){
        this(capacite, YearMonth.now(), TypeLiquide.VIDE, 0);
        this.propre = true;
    }

    /**
     * Nettoie la citerne
     * Passe prore à true, quantité liquide à 0 et typeLiquide à VIDE
     */
    public void nettoyage(){
        this.propre = true;
        this.quantiteLiquide = 0;
        this.typeLiquide = typeLiquide.VIDE;
    }

    /**
     * Pour changer de type de liquide
     * @param typeLiquide
     */
    public void changerTypeLiquide(TypeLiquide typeLiquide){
        if(propre){this.typeLiquide = typeLiquide;}
        else{System.out.println("Il faut d'abord nettoyer la cuve");}
    }

    /**
     * Pour determinée quelle citerne est la plus ancienne
     * @param citerne1
     * @param citerne2
     * @return la citerne la plus ancienne
     */
    public Citerne plusAncienne(Citerne citerne1, Citerne citerne2){
        if(citerne1.dateCreation.isBefore(citerne2.dateCreation)){
            return citerne1;
        }
        else{
            return citerne2;
        }
    }

    /**
     * @return le nombre total de citerne
     */
    public int nbCiterne(){
        return totalCiterne;
    }

    /** Redéfintion de equals
     * @see java.lang.Object#equals()
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citerne)) return false;
        Citerne citerne = (Citerne) o;
        return Float.compare(citerne.capacite, capacite) == 0 &&
                Float.compare(citerne.quantiteLiquide, quantiteLiquide) == 0 &&
                dateCreation.equals(citerne.dateCreation);
    }

    /** Redéfintion de toString
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Citerne n°" + index + ", " + typeLiquide +
                ", capacite : " + capacite + " m3" +
                ", mise en service : " + dateCreation +
                ", volume occupé : " + quantiteLiquide;
    }

    /**
     * Ajoute du liquide dans la citerne
     * @param typeLiquide
     * @param quantiteAjouter
     */
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

    /**
     * Enleve une certaine quantité de la citerne
     * @param quantiteEnlever
     */
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

    /**
     * Compare la quantité de liquide
     * @param o
     * @return 1(si la quantité de la citerne passée en param est inférieur), 0(si la quantité de la citerne passée en param est égal), -1(si la quantité de la citerne passée en param est supérieur)
     * @throws ClassCastException
     */
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

    /**
     * Clone la citerne
     * @return la citerne clone
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException{
        Citerne c = null;
        try{
            c = (Citerne) super.clone();
            //c.index=index;
            //c.capacite=capacite;
            c.typeLiquide=typeLiquide;
            c.dateCreation=dateCreation;
            c.quantiteLiquide = quantiteLiquide;
            c.propre=propre;
        }
        catch(CloneNotSupportedException e){
            System.err.println(e.getMessage());
        }
        return c;
    }

}
