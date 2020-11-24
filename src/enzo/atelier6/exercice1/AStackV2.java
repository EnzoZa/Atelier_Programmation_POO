package enzo.atelier6.exercice1;

public interface AStackV2 {
    boolean isEmpty();
    void push(Object o) throws FullStackException;
    //Pas la peine de throws le RuntimeException ou la EmptyStackException
    // car c'est une classe fille de RuntimeException
    Object peek();
    Object pop();
}
