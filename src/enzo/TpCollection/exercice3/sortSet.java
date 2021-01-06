package enzo.TpCollection.exercice3;

import java.util.*;

public class sortSet {
    private static final int MAXVALUE = 1000;
    private Set<Integer> set = new TreeSet<Integer>();
    private static Random rand = new Random();
    private int tailleList;

    public sortSet(int tailleList){
        this.tailleList = tailleList;
        randomizerSet(this.set);
    }

    public void randomizerSet(Set<Integer> set) {
        for (int i = 0; i < tailleList; i++) {
            set.add(rand.nextInt(MAXVALUE));
        }
    }

    public Set<Integer> getSet(){return set;}
}
