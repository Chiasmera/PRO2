package Opgave1;

import java.util.ArrayList;

public class LigeTal {
    public static int antalLigeTal(ArrayList<Integer> list) {
        return erLige(list, 0);
    }

    private static int erLige(ArrayList<Integer> list, int index) {
        int result = 0;

        if (index == list.size()) {
            result = 0;
        } else {
            if (list.get(index) % 2 == 0) {
                result = 1 + erLige(list, index+1);
            } else {
                result = erLige(list, index+1);
            }
        }

        return result;
    }
}
