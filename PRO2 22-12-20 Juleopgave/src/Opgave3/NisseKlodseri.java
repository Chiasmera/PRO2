package Opgave3;

import java.util.ArrayList;

public class NisseKlodseri {
    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------

    public ArrayList<Integer> calculateNewLine(ArrayList<Integer> formerLine) {
        ArrayList<Integer> oldLine = new ArrayList<>(formerLine);
        ArrayList<Integer> newLine = new ArrayList<>();

        while (!oldLine.isEmpty()) {
            int currentNumber = oldLine.get(0);
            int count = 1;
            oldLine.remove(0);
            while (!oldLine.isEmpty() && oldLine.get(0) == currentNumber ) {
                count++;
                oldLine.remove(0);
            }
            newLine.add(count);
            newLine.add(currentNumber);
        }

        return newLine;
    }

}
