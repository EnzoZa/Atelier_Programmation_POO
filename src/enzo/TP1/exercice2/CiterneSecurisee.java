package enzo.TP1.exercice2;

import java.time.YearMonth;
import java.util.Objects;

public class CiterneSecurisee extends Citerne{
    private float capaciteTropPlein;
    private float quantiteLiquideTropPlein;

    public CiterneSecurisee(float capacite, YearMonth dateCreation, TypeLiquide typeLiquide, float quantiteLiquide, float capaciteTropPlein){
        super(capacite, dateCreation, typeLiquide, quantiteLiquide);
        if(capaciteTropPlein>capacite) {
            this.capaciteTropPlein = capaciteTropPlein;
        }
        else{
            this.capaciteTropPlein = capacite*0.1f;
            System.out.println("Votre capacite de cuve trop plein est trop grande nous avons donc crées une cave de 10%" +
                    "de la capacite de votre cuve");
        }
        this.quantiteLiquideTropPlein = 0;
    }

    public CiterneSecurisee(float capacite, YearMonth dateCreation, TypeLiquide typeLiquide, float quantiteLiquide){
        super(capacite, dateCreation, typeLiquide, quantiteLiquide);
        this.capaciteTropPlein = capacite*0.1f;
        this.quantiteLiquideTropPlein = 0;
    }

    public CiterneSecurisee(float capacite, TypeLiquide typeLiquide, float quantiteLiquide){
        super(capacite, typeLiquide, quantiteLiquide);
        this.capaciteTropPlein = capacite*0.1f;
        this.quantiteLiquideTropPlein = 0;
    }

    public CiterneSecurisee(float capacite, float quantiteLiquide){
        super(capacite, quantiteLiquide);
        this.capaciteTropPlein = capacite*0.1f;
        this.quantiteLiquideTropPlein = 0;
    }

    public CiterneSecurisee(float capacite){
        super(capacite);
        this.capaciteTropPlein = capacite*0.1f;
        this.quantiteLiquideTropPlein = 0;
    }

    public void setCapaciteTropPlein(float capaciteTropPlein) {
        this.capaciteTropPlein = capaciteTropPlein;
    }

    @Override
    public String toString() {

        return  super.toString() + ", capacite cuve trop plein : " + capaciteTropPlein + " m3" +
                ", volume occupé cuve trop plein : " + quantiteLiquideTropPlein;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CiterneSecurisee)) return false;
        if (!super.equals(o)) return false;
        CiterneSecurisee that = (CiterneSecurisee) o;
        return Float.compare(that.capaciteTropPlein, capaciteTropPlein) == 0 &&
                Float.compare(that.quantiteLiquideTropPlein, quantiteLiquideTropPlein) == 0 && super.equals(o);
    }


    public void ajouterLiquide(TypeLiquide typeLiquide, float quantiteAjouter) {
        if(typeLiquide != this.typeLiquide && propre == false || quantiteAjouter < 0) {
            System.out.println("Impossible d'ajouter un contenu différent sans avoir une cuve propre");
        }
        float quantiteRestant = capacite - quantiteLiquide;
        if(quantiteAjouter <= quantiteRestant) {
            quantiteLiquide += quantiteAjouter;
        }
        else if(quantiteAjouter-quantiteRestant < (capacite/2)-quantiteLiquideTropPlein){
            quantiteLiquide = capacite;
            quantiteLiquideTropPlein += quantiteAjouter-quantiteRestant;
            System.out.println("Votre cuve de trop plein c'est vu ajouté de " + quantiteLiquideTropPlein + " m3");
        }
        else if (quantiteAjouter-quantiteRestant < capacite-quantiteLiquideTropPlein){
            quantiteLiquideTropPlein += quantiteAjouter-quantiteRestant;
            System.out.println("Votre cuve de trop plein c'est vu ajouté de " + quantiteLiquideTropPlein + " m3"
            + ".Mais appelez un technicien car votre cuve est à moitier pleine.");
        }
        else{
            quantiteLiquideTropPlein = capaciteTropPlein;
            System.out.println("Votre cuve est pleine et ne dispone pas de l'espace nécessaire pour pouvoir tout ajouter.");
        }
    }

    public void enleverLiquide(float quantiteEnlever) {
        if(quantiteLiquideTropPlein>=quantiteEnlever){
            quantiteLiquideTropPlein-=quantiteEnlever;
        }
        else if(quantiteLiquideTropPlein!=0 && quantiteEnlever-quantiteLiquideTropPlein<quantiteLiquide){
            quantiteEnlever -= quantiteLiquideTropPlein;
            quantiteLiquideTropPlein = 0;
            quantiteLiquide -= quantiteEnlever;
        }
        else {
            if (quantiteEnlever > quantiteLiquide) {// à ajouter dans class exception
                System.out.println("Volume à enlever trop élévé... Vidangeage de la cuve ");
                quantiteLiquide = 0;
                typeLiquide = TypeLiquide.VIDE;
            } else {
                quantiteLiquide -= quantiteEnlever;
                System.out.println("done..");
            }
        }
    }
}
