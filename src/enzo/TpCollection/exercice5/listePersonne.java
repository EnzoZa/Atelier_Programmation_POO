package enzo.TpCollection.exercice5;

import java.util.ArrayList;

public class listePersonne{
    private ArrayList<Personne> listeP = new ArrayList<Personne>();

    public listePersonne(ArrayList<Personne> listeP){
        this.listeP = listeP;
    }

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
