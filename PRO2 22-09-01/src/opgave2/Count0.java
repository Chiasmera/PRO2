package opgave2;

import java.util.ArrayList;

public class Count0 {
    public static int countZeroes(ArrayList<Integer> list) {
        return countZeroes(list, 0, list.size()-1);
    }
    private static int countZeroes (ArrayList<Integer> list, int start, int end) {
        int result = 0;
        int middle = (start+end) / 2;

        if (start == end) {
            if (list.get(start) == 0) {
                result = 1;
            }
        } else {
            result = result + countZeroes(list, start, middle);
            result = result + countZeroes(list, middle+1, end);
        }

        return result;
    }
}
