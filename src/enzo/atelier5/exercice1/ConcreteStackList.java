package enzo.atelier5.exercice1;
import java.util.*;

public class ConcreteStackList implements AStack{
    private ArrayList<Object> list;

    public ConcreteStackList(ArrayList<Object> list){
        this.list = list;
    }

    public ConcreteStackList(){
        list = new ArrayList<Object>();
    }

    public void printList(){
        if(!isEmpty()){
            for(Object i : this.list){
                System.out.println(i);
            }
        }
        else{
            System.err.println("Pile vide");
        }
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object peek() {

        Object result = null;
        if(!isEmpty()){
            result = list.get(list.size()-1);
        }
        else{
            System.err.println("Pile vide");
        }
        return result;
    }

    @Override
    public Object pop() {

        Object result = null;
        if(!isEmpty()){
            result = list.get(list.size()-1);
            list.remove(list.size()-1);
        }
        else{
            System.err.println("Pile vide");
        }
        return result;
    }
}
