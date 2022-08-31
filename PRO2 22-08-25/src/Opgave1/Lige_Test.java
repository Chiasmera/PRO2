package Opgave1;

import java.util.ArrayList;

public class Lige_Test {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(9);
        liste.add(7);
        liste.add(223);
        liste.add(12);
        liste.add(32);
        liste.add(2);
        liste.add(6);
        liste.add(2);
        liste.add(4);


        System.out.println(LigeTal.antalLigeTal(liste));
    }
}
