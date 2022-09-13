package Opgave1;

import java.util.ArrayList;

public class SumRekursivt {


    public static int findSum( ArrayList<Integer> list) {
        return sumRecursive(list, 0, list.size()-1);
    }

    private static int sumRecursive (ArrayList<Integer> list, int start, int end) {
        int result = 0;
        int middle = (start+end) / 2;

        if (start == end) {
            result = list.get(start);
        } else {
            result = result + sumRecursive(list, start, middle);
            result = result + sumRecursive(list, middle+1, end);
        }

        return result;
    }
}
