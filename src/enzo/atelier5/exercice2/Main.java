package enzo.atelier5.exercice2;

public class Main {
    public static void main(String[] args) {
        Mere m1 = new Mere(1,new UneClasse());
        Fille f1 = new Fille(1,new UneClasse(),new UneClasse());
        try{
            Mere m2 = (Mere) m1.clone();
        }catch(CloneNotSupportedException e){
            System.err.println(e);
        }
        try{
            Fille f2 = (Fille) f1.clone();
        }catch(CloneNotSupportedException e){
            System.err.println(e);
        }
    }
}
