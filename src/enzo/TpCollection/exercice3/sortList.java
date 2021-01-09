package enzo.TpCollection.exercice3;

import java.util.*;

public class sortList {
    private static final int MAXVALUE = 1000;
    private List<Integer> list = new ArrayList<Integer>();
    private static Random rand = new Random();
    private int tailleList;

    /**
     * Constructeur d'un trieur de liste
     * @param tailleList
     */
    public sortList(int tailleList){
        this.tailleList = tailleList;
        randomizerList(this.list);
        Collections.sort(list);
    }

    /**
     * Crée une liste remplis d'entier aléatoire
     * @param list
     */
    public void randomizerList(List<Integer> list) {
        for (int i = 0; i < tailleList; i++) {
            list.add(rand.nextInt(MAXVALUE));
        }
    }

    /**
     * Accesseur
     * @return return la liste
     */
    public List<Integer> getList(){return list;}
}
