package enzo.atelier5.exercice2;

public class Mere implements Cloneable{
    private int i;
    private UneClasse unObjet; //Clonable

    public Mere(int unI, UneClasse unObj){
        i = unI;
        unObjet = unObj;
    }

    protected Object clone() throws CloneNotSupportedException{
        Mere m = null;
        try{
            m = (Mere) super.clone();
            m.i = i;
            m.unObjet = (UneClasse)unObjet.clone();
        }
        catch(CloneNotSupportedException e){
            System.err.println(e.getMessage());
        }
        return m;
    }
}
