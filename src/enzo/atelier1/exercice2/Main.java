package enzo.atelier1.exercice2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entier n = new Entier(5,0,10);
		Entier nFou = new EntierFou(0,5);
		n.increment(4);
		System.out.println(n);
		nFou.increment(5);
		System.out.println(nFou);
	}

}
