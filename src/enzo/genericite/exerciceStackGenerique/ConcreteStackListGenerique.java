package enzo.genericite.exerciceStackGenerique;

import java.util.ArrayList;


public class ConcreteStackListGenerique<E> implements AStackGenerique<E> {
    private ArrayList<E> list;

    public ConcreteStackListGenerique(ArrayList<E> list){
        this.list = list;
    }

    public ConcreteStackListGenerique(){
        list = new ArrayList<E>();
    }

    public String toString(){
        String result = "";
        if(!isEmpty()){
            for(E i : this.list){
                result += (i + "|");
            }
        }
        else{
            result = "Pile vide";
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E o) {
        list.add(o);
    }

    @Override
    public E peek() {

        E result = null;
        if(!isEmpty()){
            result = list.get(list.size()-1);
        }
        else{
            System.err.println("Pile vide");
        }
        return result;
    }

    @Override
    public E pop() {

        E result = null;
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
