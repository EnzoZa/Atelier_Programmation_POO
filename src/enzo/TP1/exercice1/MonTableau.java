package enzo.TP1.exercice1;

import enzo.TP1.exercice2.Citerne;

public class MonTableau implements EstComparable{
    private int [] tableau;

    /**
     * Constructeur d'un tableau
     * @param tableau
     */
    public MonTableau(int [] tableau){
        this.tableau = tableau;
    }

    /**
     * Constructeur d'un tableau
     * @param tableau
     * @param taille
     */
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

    /**
     * Compare la somme des tableaux
     * @param o
     * @return 1(si la somme du tableau passée en param est inférieur), 0(si la somme du tableau passée en param est égal), -1(si la somme du tableau passée en param est supérieur)
     * @throws ClassCastException
     */
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

