package enzo.atelier5.exercice1;

public class Main {
    public static void main(String[] args) {

        ConcreteStackArray tab = new ConcreteStackArray(10);
        System.out.println("------------- AVEC TAB -------------");
        tab.push("Coucou");
        System.out.println(tab);
        System.out.println("-------------");
        System.out.println(tab.pop());
        System.out.println(tab);
        System.out.println("-------------");
        tab.push("Coucou");
        System.out.println(tab);
        System.out.println("-------------");
        System.out.println(tab.isEmpty());
        System.out.println(tab.pop());
        System.out.println(tab.isEmpty());
        System.out.println("-------------");
        tab.push("Coucou");
        tab.push("Salut");
        System.out.println(tab);
        System.out.println("-------------");
        System.out.println(tab.pop());
        System.out.println(tab);

        System.out.println("------------- AVEC LIST -------------");

        ConcreteStackList list = new ConcreteStackList();
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
