package enzo.atelier5.exercice1;

public class ConcreteStackList implements AStack{
    private ArrayList<Object> list;

    public ConcreteStackList(ArrayList<Object> list){
        this.list = list;
    }

    public ConcreteStackList(){
        list =  = new ArrayList<Object>();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(Object o) {

    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }
}
