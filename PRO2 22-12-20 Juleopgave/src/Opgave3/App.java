package Opgave3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        NisseKlodseri n1 = new NisseKlodseri();
        ArrayList<Integer> line1 = new ArrayList<>();
        line1.add(1);


        ArrayList<Integer> oldList = new ArrayList<>(line1);
        for (int i = 0; i < 50; i++) {

           oldList = n1.calculateNewLine(oldList);
            System.out.println(oldList);


        }


    }


}
