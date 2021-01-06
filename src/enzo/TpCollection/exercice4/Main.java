package enzo.TpCollection.exercice4;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String a = "cette";
        String b = "chaine";
        String a1 = "avec";
        String b1 = "quelques";
        String a2 = "autres";
        String b2 = "toutes";
        String a3 = "differentes";
        String b3 = "zozo";
        ArrayList<String> sL = new ArrayList<String>();
        sL.add(a);
        sL.add(b);
        sL.add(a1);
        sL.add(b1);
        sL.add(a2);
        sL.add(b2);
        sL.add(a3);
        sL.add(b3);
       //sortString s = new sortString(sL);
        sortString s = new sortString(args);
        System.out.println(s.getStringList());
        //System.out.println(s.lexicalSort());
        //System.out.println(s.reverseLexicalSort());
        //System.out.println(s.militarySort());
    }
}
