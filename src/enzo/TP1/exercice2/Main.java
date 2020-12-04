package enzo.TP1.exercice2;

public class Main {
    public static void main(String[] args) {
        /*
        try{
            Citerne citerne = new Citerne(15000);
            Citerne citerne1 = new Citerne(15000,Citerne.TypeLiquide.VIDE,14000);
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        Citerne c = new Citerne(15000);
        Citerne c1 = new Citerne(15000);
        int a = 0;
        System.out.println(c);
        c.ajouterLiquide(Citerne.TypeLiquide.EAU, 10000);
        System.out.println(c);
        c.enleverLiquide(11000);
        System.out.println(c);
        c.nettoyage();
        c.changerTypeLiquide(Citerne.TypeLiquide.VIN);
        System.out.println(c);

        try{
            System.out.println(c1.compareA(c));//Affiche 1,
            //car 1+2+3+4 > -1+2-3+4+5
        }
        catch(ClassCastException e){
            System.err.println(e.getMessage());
        }

        try{
            System.out.println(c.compareA(a));
        }
        catch(ClassCastException e){
            System.err.println(e.getMessage());
        }
         */


        CiterneSecurisee cs = new CiterneSecurisee(1000);
        cs.ajouterLiquide(Citerne.TypeLiquide.EAU, 1010);
        System.out.println(cs);
        cs.enleverLiquide(100);
        System.out.println(cs);
        cs.ajouterLiquide(Citerne.TypeLiquide.EAU, 100);
        System.out.println(cs);
        CiterneSecurisee cs2 = new CiterneSecurisee(1000);
        cs2.ajouterLiquide(Citerne.TypeLiquide.EAU, 910);
        System.out.println(cs.equals(cs2));
        int d = 0;

        try{
            CiterneSecurisee test = new CiterneSecurisee(1000);
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        try{
            CiterneSecurisee test1 = new CiterneSecurisee(21000);
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        try{
            System.out.println(cs.compareA(cs2));
        }
        catch(ClassCastException e){
            System.err.println(e.getMessage());
        }
        try{
            System.out.println(cs.compareA(d));
        }
        catch(ClassCastException e){
            System.err.println(e.getMessage());
        }

    }
}
