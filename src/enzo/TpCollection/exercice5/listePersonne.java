package enzo.TpCollection.exercice5;

import java.util.ArrayList;

public class listePersonne{
    private ArrayList<Personne> listeP = new ArrayList<Personne>();

    /**
     * Constructeur d'une liste de Personne
     * @param listeP
     */
    public listePersonne(ArrayList<Personne> listeP){
        this.listeP = listeP;
    }

    /**
     * Trie les personne en fonction de leur age puis de leur nom puis de leur prénom
     * @return retourne la liste de personne trier
     */
    public ArrayList<Personne> sortPersonne(){
        Personne temp;
        for(int i=0; i<listeP.size()-1;i++){
            for(int j=0; j<listeP.size()-1;j++) {
                if (listeP.get(j).compareTo(listeP.get(j + 1)) < 0) {
                    temp = new Personne(listeP.get(j));
                    listeP.set(j, listeP.get(j + 1));
                    listeP.set(j + 1, temp);
                }
                if(listeP.get(j).plusAgeeQue(listeP.get(j+1))){
                    temp = new Personne(listeP.get(j));
                    listeP.set(j, listeP.get(j + 1));
                    listeP.set(j + 1, temp);
                }
            }
        }
        return listeP;
    }
}
