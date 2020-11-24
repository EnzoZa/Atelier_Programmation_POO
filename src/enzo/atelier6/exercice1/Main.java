package enzo.atelier6.exercice1;
import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {

        ConcreteStackArrayV2 tab = new ConcreteStackArrayV2(10);
        try {
            tab.push("Coucou");
            System.out.println(tab);
            System.out.println("-------------");
            tab.push("Coucou");
            System.out.println(tab);
            System.out.println("-------------");
            tab.push("Coucou");
            tab.push("Salut");
            System.out.println(tab);
        }
        catch(FullStackException e){
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("-------------");
            System.out.println(tab.pop());
            System.out.println(tab);
            System.out.println(tab.pop());
            System.out.println("-------------");
            System.out.println(tab.pop());
            System.out.println(tab);
        }
        catch(EmptyStackException e){
            System.err.println(e.getMessage());
        }
    }
}