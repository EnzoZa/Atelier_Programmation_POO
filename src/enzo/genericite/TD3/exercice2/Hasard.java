package enzo.genericite.TD3.exercice2;
import java.util.Random;
public class Hasard {
    public static <T> T aleatoire(T[] tab){
        T result = null;
        if(tab.length != 0 && tab!=null){
            Random ran = new Random();
            result = tab[ran.nextInt(tab.length)];
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] integer = {0,1,2,3,4,5,6,7,8,9,10};
        String[] string = {"Coucou","Salut","Bonjour","Bonsoir"};
        System.out.println("Rand in int : " + Hasard.aleatoire(integer));
        System.out.println("Rand in string : " + Hasard.aleatoire(string));
    }
}
