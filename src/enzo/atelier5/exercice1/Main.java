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

        ConcreteStackList list = new ConcreteStackList();
        list.push("Coucou");
        list.printList();
        System.out.println("1");
        System.out.println("-------------");
        System.out.println(list.pop());
        System.out.println("toto");
        list.printList();
        System.out.println("2");
        System.out.println("-------------");
        list.push("Coucou");
        list.printList();
        System.out.println("3");
        System.out.println("-------------");
        System.out.println(list.isEmpty());
        System.out.println(list.pop());
        System.out.println(list.isEmpty());
        System.out.println("4");
        System.out.println("-------------");
        list.push("Coucou");
        list.push("Salut");
        list.printList();
        System.out.println("5");
        System.out.println("-------------");
        System.out.println(list.peek());
        System.out.println(list.pop());
        list.printList();
        System.out.println("6");
    }
}
