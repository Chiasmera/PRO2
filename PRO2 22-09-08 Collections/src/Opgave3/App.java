package Opgave3;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Skole skole1 = new Skole("Gurrevejen Skole");

        Studerende s1 = new Studerende(1, "Hans");
        Studerende s2 = new Studerende(2, "Ole Lukøje");
        Studerende s3 = new Studerende(3, "Frederik");
        Studerende s4 = new Studerende(4, "Julemanden");
        Studerende s5 = new Studerende(5, "Julius");
        Studerende s6 = new Studerende(6, "Viggo");
        Studerende s7 = new Studerende(7, "Odyseus");
        Studerende s8 = new Studerende(8, "Homer");
        Studerende s9 = new Studerende(9, "Thor");

        skole1.addStuderende(s1.getStudieNr(), s1);
        skole1.addStuderende(s2.getStudieNr(), s2);;
        skole1.addStuderende(s3.getStudieNr(), s3);
        skole1.addStuderende(s4.getStudieNr(), s4);
        skole1.addStuderende(s5.getStudieNr(), s5);
        skole1.addStuderende(s6.getStudieNr(), s6);
        skole1.addStuderende(s7.getStudieNr(), s7);
        skole1.addStuderende(s8.getStudieNr(), s8);
        skole1.addStuderende(s9.getStudieNr(), s9);

    //    System.out.println(skole1);

        TreeSet<Studerende> treeSet = new TreeSet<>(new StuderendeComparator());
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);
        treeSet.add(s6);
        treeSet.add(s7);
        treeSet.add(s8);
        treeSet.add(s9);

        System.out.println(treeSet);

    }
}
