package enzo.genericite.TD3.exercice1;

public class Main {
    public static void main(String[] args) {
        TripletGenerique<Integer,Integer,String> t1 = new TripletGenerique<Integer,Integer,String>(12,3,"3");
        System.out.println(t1);

        //TripletGenerique<String,String,Integer> t2 = new TripletGenerique<>(12,3,"coucou");
        //System.out.println(t2);
    }
}
