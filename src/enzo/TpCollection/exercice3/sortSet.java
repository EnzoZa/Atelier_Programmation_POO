package enzo.TpCollection.exercice3;

import java.util.*;

public class sortSet {
    private static final int MAXVALUE = 1000;
    private Set<Integer> set = new TreeSet<Integer>();
    private static Random rand = new Random();
    private int tailleList;

    /**
     * Constructeur d'un trieur de set
     * @param tailleList
     */
    public sortSet(int tailleList){
        this.tailleList = tailleList;
        randomizerSet(this.set);
    }

    /**
     * Crée une liste remplis d'entier aléatoire
     * @param list
     */
    public void randomizerSet(Set<Integer> set) {
        for (int i = 0; i < tailleList; i++) {
            set.add(rand.nextInt(MAXVALUE));
        }
    }

    /**
     * Accesseur
     * @return retourne le set
     */
    public Set<Integer> getSet(){return set;}
}
