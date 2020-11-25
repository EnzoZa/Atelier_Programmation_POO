package enzo.TP1.exercice1;

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

    public int compareA(Object o){
        int result1 = this.sommeTableau();
        MonTableau tab = (MonTableau)o;
        int result2 = tab.sommeTableau();
        int resultFin = 0;

        if(result1>result2){
            resultFin = 1;
        }
        else if(result1<result2){
            resultFin = -1;
        }
        return resultFin;
    }

}

