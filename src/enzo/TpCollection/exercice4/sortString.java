package enzo.TpCollection.exercice4;

import java.util.*;

public class sortString implements Comparator<String>{
    private ArrayList<String> stringList;
    //private ArrayList<String> sortedList = new ArrayList<String>();

    /**
     * Constructeur d'une liste de String
     * @param stringList
     */
    public sortString(ArrayList<String> stringList){
        this.stringList = stringList;
        switch (stringList.get(0)){
            case "military":
                this.stringList.remove(0);
                stringList = this.militarySort();
                break;
            case "lexical":
                this.stringList.remove(0);
                stringList = this.lexicalSort();
                break;
            case "reverseLexical":
                this.stringList.remove(0);
                stringList = this.reverseLexicalSort();
                break;
            default :
                System.err.println("Veillez rentrer une valeur valide {military,lexical,reverseLexical}");
        }
    }

    /**
     * Constructeur d'une liste de String
     * @param args
     */
    public sortString(String[] args){
        this.stringList = new ArrayList<String>();
        for(int i=0;i<args.length;i++){
            this.stringList.add(args[i]);
        }
        switch (stringList.get(0)){
            case "military":
                this.stringList.remove(0);
                stringList = this.militarySort();
                break;
            case "lexical":
                this.stringList.remove(0);
                stringList = this.lexicalSort();
                break;
            case "reverseLexical":
                this.stringList.remove(0);
                stringList = this.reverseLexicalSort();
                break;
            default :
                System.err.println("Veillez rentrer une valeur valide {military,lexical,reverseLexical}");
        }
    }

    public int compare(String s1, String s2){
        return (s1.toLowerCase().compareTo(s2.toLowerCase()));
    }

    /**
     * Trie dans l'ordre lexicographique
     * @return retourne la liste trier dans l'ordre lexicographique
     */
    public ArrayList<String> lexicalSort(){
        String temp;
        for(int i=0; i<stringList.size()-1;i++){
            for(int j=0; j<stringList.size()-1;j++) {
                if (compare(stringList.get(j), stringList.get(j + 1)) > 0) {
                    temp = (stringList.get(j));
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, temp);
                }
            }
        }
        return stringList;
    }

    /**
     * Trie de façon militaire
     * @return retourn la liste trier de façon militaire
     */
    public ArrayList<String> militarySort(){
        String temp;
        for(int i=0; i<stringList.size()-1;i++){
            for(int j=0; j<stringList.size()-1;j++) {
                if (compare(stringList.get(j), stringList.get(j + 1)) > 0) {
                    temp = (stringList.get(j));
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, temp);
                }
                if(stringList.get(j).length() > stringList.get(j+1).length()){
                    temp = (stringList.get(j));
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, temp);
                }
            }
        }
        return stringList;
    }

    /**
     * Trie dans l'ordre inverse de l'ordre lexicographique
     * @return retourne la liste trier dans l'ordre inverse de l'ordre lexicographique
     */
    public ArrayList<String> reverseLexicalSort(){
        String temp;
        for(int i=0; i<stringList.size()-1;i++){
            for(int j=0; j<stringList.size()-1;j++) {
                if (compare(stringList.get(j), stringList.get(j + 1)) < 0) {
                    temp = (stringList.get(j));
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, temp);
                }
            }
        }
        return stringList;
    }

    /**
     * Accesseur
     * @return retourne la liste de String
     */
    public ArrayList<String> getStringList(){return stringList;}
}
