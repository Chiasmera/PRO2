package Opgave3;

import java.util.ArrayList;

public class MergeSort {

    //Call the helper method with the highest and lowest position in the list
    public static void mergeSort(ArrayList<Integer> list) {
        mergeSortHelper(list, 0, list.size() - 1);
    }

    private static void mergeSortHelper(ArrayList<Integer> list, int low, int high) {
        //Calculate middle of list piece
        int middle = (low + high) / 2;

        //If this sublist has more than two values, split it into two before merging
        if (low != middle) {
            mergeSortHelper(list, low, middle);
        }
        if (middle + 1 != high) {
            mergeSortHelper(list, middle + 1, high);
        }
        mergeLists(list, low, middle, high);
    }

    private static void mergeLists(ArrayList<Integer> list, int low, int middle, int high) {
        //Temporary list to hold sorted values
        ArrayList<Integer> temp = new ArrayList<>();

        //Pointers to indicate where we are at, in the two sub-lists
        int list1Pointer = low;
        int list2Pointer = middle+1;

        //As long as both sub-lists have remaining numbers left...
        while (list1Pointer <= middle && list2Pointer <= high) {

            //If the value at pointer 1 is less than or equal to the other...
            if (list.get(list1Pointer).compareTo(list.get(list2Pointer)) <= 0) {

                //add that value to the temp list and increment the pointer
                temp.add(list.get(list1Pointer));
                list1Pointer++;

                //if not, the other value is added to the list and that pointer is incremented....
            } else {
                temp.add(list.get(list2Pointer));
                list2Pointer++;
            }
        }

        //If there is still values left in the first sublist, add them all to the temp list
        while (list1Pointer <= middle) {
            temp.add(list.get(list1Pointer));
            list1Pointer++;
        }

        //If there is still values left in the second sublist, add them all to the temp list
        while (list2Pointer <= high) {
            temp.add(list.get(list2Pointer));
            list2Pointer++;
        }


        //Temp is now inserted into our main list, in the place where our sublists were

        //Make a counter to keep track of where in the temp list we are at
        int tempCounter = 0;

        //Beginning at the lowest point of our sublists, continuing until the highest point
        for (int i = low; i <= high; i++) {

            //Get the value at the current place in the temp list, add it into the current place in the main list
            list.set(i, temp.get(tempCounter));
            //Increment the tempcounter
            tempCounter++;
        }
    }
}
