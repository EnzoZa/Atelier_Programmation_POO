package enzo.TP1.exercice1;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[] {1,2,3,4};
        int[] b = new int[] {-1,2,-3,4,5};
        MonTableau m1=new MonTableau(a);
        MonTableau m2=new MonTableau(b);
        System.out.println(m1.compareA(m2)); //Affiche 1,
        //car 1+2+3+4 > -1+2-3+4+5

    }
}
