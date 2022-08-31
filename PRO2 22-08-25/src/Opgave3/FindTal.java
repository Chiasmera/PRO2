package Opgave3;

import java.util.ArrayList;

public class FindTal {

    public static boolean findTal (ArrayList<Integer> list, int target) {
        return binarySearch(list, target, 0, list.size()-1);
    }

    private static boolean binarySearch (ArrayList<Integer> list, int target, int firstIndex, int secondIndex) {
        boolean result = false;
        int middle = (firstIndex+secondIndex)/2;

        if (firstIndex > secondIndex) {
            result = false;
        } else {
            if (target == list.get(middle)) {
                result = true;
            } else if (target < list.get(middle)) {
                result = binarySearch(list,target,firstIndex,middle-1);
            } else {
                result = binarySearch(list,target,middle+1,secondIndex);
            }
        }

        return result;
    }
}
