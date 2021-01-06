package enzo.genericite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionGenerique{
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        System.out.println(c);
        for (String s : args) {
            c.add(s);
        }
        //c.forEach(e -> System.out.println(e));

        System.out.println("Premiere méthode : agregate");

        c.stream()
                .filter(e -> e.length() == 2)
                .forEach(e -> System.out.println(e));

        System.out.println("Second méthode : for");

        for (String s : c) {
            if(s.length()==2){
                System.out.println(s);
            }
        }

        System.out.println("Troisieme méthode : iterator");

        for(Iterator<String> i = c.iterator(); i.hasNext();){
            String s = i.next();
            if(s.length()==2){
                System.out.println(s);
            }
        }
    }
}
