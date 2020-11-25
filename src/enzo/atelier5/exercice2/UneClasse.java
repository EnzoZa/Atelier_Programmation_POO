package enzo.atelier5.exercice2;

public class UneClasse implements Cloneable{
    /*
    private Vector items;

    public Object clone() {
        Stack s = (UneClasse)super.clone // Clonage de surface
        try {
            s.items = (Vector)items.clone(); // Clonage en profondeur
        } catch(CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
        return o;
    }
    */

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch(CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
        return o;
    }

}
