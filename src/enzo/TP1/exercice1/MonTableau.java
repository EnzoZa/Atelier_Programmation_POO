package enzo.TP1.exercice1;

public class MonTableau implements EstComparable{
    private int [] tableau;

    public MonTableau(int [] tableau){
        this.tableau = tableau;
    }

    public MonTableau(int [] tableau, int taille){
        this.tableau = new int [taille];
    }

    public int compareA(Object o){
        int result1 = 0;
        int result2 = 0;
        int resultFin = 0;

        for(int value : this.tableau){
            result1+=value;
        }

        for(int value : (MonTableau) o.tableau){
            result2+=value;
        }

        if(result1>result2){
            resultFin = 1;
        }
        else if(result1<result2){
            resultFin = -1;
        }
        return resultFin;
    }

}

