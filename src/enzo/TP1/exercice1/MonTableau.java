package enzo.TP1.exercice1;

import enzo.TP1.exercice2.Citerne;

public class MonTableau implements EstComparable{
    private int [] tableau;

    public MonTableau(int [] tableau){
        this.tableau = tableau;
    }

    public MonTableau(int [] tableau, int taille){
        this.tableau = new int [taille];
    }

    public int sommeTableau(){
        int result = 0;
        for(int value : this.tableau){
            result+=value;
        }
        return result;
    }

    //Gerer Exceptions
    public int compareA(Object o) throws ClassCastException {
        int result = 0;
        if (!(o instanceof MonTableau)) throw new ClassCastException("Ceci n'est pas un tableau");
        else {
            int somme1 = this.sommeTableau();
            MonTableau tab = (MonTableau) o;
            int somme2 = tab.sommeTableau();
            if (somme1 > somme2) {
                result = 1;
            } else if (somme1 < somme2) {
                result = -1;
            }
        }
        return result;
    }

}

