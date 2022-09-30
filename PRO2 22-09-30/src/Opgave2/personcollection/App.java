package Opgave2.personcollection;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Julemanden");
        Person p2 = new Person("Påskemanden");
        Person p3 = new Person("Julius");
        Person p4 = new Person("Peter");

        PersonCollection pc1 = new PersonCollection();
        pc1.add(p1);
        pc1.add(p2);
        pc1.add(p3);
        pc1.add(p4);


        Iterator minIterator = pc1.iterator();
        pc1.remove(0);
        try {
            while (minIterator.hasNext()) {
                System.out.println(minIterator.next());
            }
        } catch (ConcurrentModificationException error) {
            System.out.println(error.getMessage());
        }



    }




}
