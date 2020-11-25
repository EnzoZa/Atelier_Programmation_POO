package enzo.atelier5.exercice2;

public class Fille extends Mere{
    private Object unObjetSensible;

    public Fille(int unI, UneClasse unObj, Object unObjSens){
        super(unI,unObj);
        unObjetSensible = unObjSens;
    }

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
