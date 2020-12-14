package enzo.genericite;

public class Boite {
    private Object nimporteQuoi;

    public Boite(Object nimporteQuoi) {
        this.nimporteQuoi = nimporteQuoi;
    }

    public Object getNimporteQuoi() {
        return nimporteQuoi;
    }

    public void setNimporteQuoi(Object nimporteQuoi) {
        this.nimporteQuoi = nimporteQuoi;
    }

    public static void main(String[] args) {
        Boite boiteTest = new Boite(10);
        System.out.println(boiteTest.getNimporteQuoi());
        Boite boiteTest2 = new Boite("10");
        System.out.println(boiteTest2.getNimporteQuoi());
    }
}
