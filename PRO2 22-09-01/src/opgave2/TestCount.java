package opgave2;

import Opgave1.SumRekursivt;

import java.util.ArrayList;

public class TestCount {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(23);
        list.add(9);
        list.add(1);
        list.add(0);
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(0);
        list.add(0);
        list.add(2);

        System.out.println(Count0.countZeroes(list));
    }
}
