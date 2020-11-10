package enzo.atelier5.exercice1;

public class Main {
    public static void main(String[] args) {
        ConcreteStackArray tab = new ConcreteStackArray(10);
        tab.push("Coucou");
        tab.printTab();
        System.out.println("-------------");
        System.out.println(tab.pop());
        tab.printTab();
        System.out.println("-------------");
        tab.push("Coucou");
        tab.printTab();
        System.out.println("-------------");
        System.out.println(tab.isEmpty());
        System.out.println(tab.pop());
        System.out.println(tab.isEmpty());
        System.out.println("-------------");
        tab.push("Coucou");
        tab.push("Salut");
        tab.printTab();
        System.out.println("-------------");
        System.out.println(tab.pop());
        tab.printTab();


    }
}
