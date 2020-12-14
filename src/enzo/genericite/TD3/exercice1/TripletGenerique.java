package enzo.genericite.TD3.exercice1;

public class TripletGenerique<T,U,V> {
    private T first;
    private U second;
    private V third;

    public TripletGenerique(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }


    @Override
    public String toString() {
        return "el1 : " + first + ", el2 : " + second + ", el3 : " + third;
    }
}
