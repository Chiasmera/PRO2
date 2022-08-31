package Opgave3;

import java.util.ArrayList;

public class Find_Test {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        liste.add(10);

        System.out.println(FindTal.findTal(liste, 11));
    }
}
