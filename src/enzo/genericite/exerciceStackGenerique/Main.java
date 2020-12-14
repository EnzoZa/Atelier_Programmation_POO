package enzo.genericite.exerciceStackGenerique;

import enzo.atelier5.exercice1.ConcreteStackArray;
import enzo.atelier5.exercice1.ConcreteStackList;

public class Main {
    public static void main(String[] args) {

        ConcreteStackListGenerique<String> list = new ConcreteStackListGenerique();
        list.push("Coucou");
        System.out.println(list);
        System.out.println("1");
        System.out.println("-------------");
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println("2");
        System.out.println("-------------");
        list.push("Coucou");
        System.out.println(list);
        System.out.println("3");
        System.out.println("-------------");
        System.out.println(list.isEmpty());
        System.out.println(list.pop());
        System.out.println(list.isEmpty());
        System.out.println("4");
        System.out.println("-------------");
        list.push("Coucou");
        list.push("Salut");
        System.out.println(list);
        System.out.println("5");
        System.out.println("-------------");
        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println("6");
    }
}
