package enzo.TpCollection.exercice1;

public class PaireGenerique<T,U> {
    private T first;
    private U second;

    /**
     * Constructeur d'une Paire Générique
     * @param first
     * @param second
     */
    public PaireGenerique(T first, U second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Accesseur
     * @return le premier élément
     */
    public T getFirst() {
        return first;
    }

    /**
     * Modificateur
     * @param first
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * Accesseur
     * @return le second élément
     */
    public U getSecond() {
        return second;
    }

    /**
     * Modificateur
     * @param second
     */
    public void setSecond(U second) {
        this.second = second;
    }

    /** Redéfintion de toString
     * @see Object#toString()
     */
    public String toString() {
        return "el1 : " + first + ", el2 : " + second;
    }
}
