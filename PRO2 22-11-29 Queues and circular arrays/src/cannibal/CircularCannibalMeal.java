package cannibal;

import java.util.Random;

public class CircularCannibalMeal {
    //Fields ---------------------------------------------------------------------------------------------------------
    private Cookpot next;
    private Cookpot previous;
    private Cookpot current;

    private int size;

    //Constructors ---------------------------------------------------------------------------------------------------
    public CircularCannibalMeal() {
        this.size = 0;
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    //Methods - Other ------------------------------------------------------------------------------------------------

    /**
     * Adds person to the cannibal dance meal
     */
    public void addPerson(Person p) {
        Cookpot cookpot = new Cookpot();
        cookpot.content = p;
        if (current == null) {
            current = cookpot;
            next = cookpot;
            previous = cookpot;
        } else {
            next = current;
            current = cookpot;
            previous.next = current;
            current.next = next;
        }
        size++;
    }

    /**
     * Removes random person from the cannibal dance
     *
     * @return
     */
    public Person eatRandomPerson() {
        Random rand = new Random();
        int randomNum = Math.abs(rand.nextInt(0,size+1));

        return eatNextPerson(randomNum);
    }

    /**
     * Removes person "count" places from the last eaten
     *
     * @param count
     * @return
     */
    public Person eatNextPerson(int count) {
        int countRemaining = count;
        Cookpot newPrevious = previous;
        while (countRemaining>0) {
            newPrevious = previous;
            previous = current;
            current = next;
            next = next.next;
            countRemaining--;
        }

        Cookpot chosen = current;

        current = previous;
        current.next = next;
        previous = newPrevious;
        previous.next = current;

        Person chosenPerson = chosen.content;
        chosen.content = null;
        chosen.next = null;

        size--;

        return chosenPerson;
    }

    /**
     * Prints all persons waiting to be served
     */
    public void printPersons() {
        if (current != null) {
            if (current.equals(previous)) {
                System.out.println(current.content);
            } else {
                Cookpot currentPrint = current;
                while (!currentPrint.next.equals(current)) {
                    System.out.println(currentPrint.content);
                    currentPrint = currentPrint.next;
                }
                System.out.println(currentPrint.content);
            }
        }
    }

    class Cookpot {
        Person content;
        Cookpot next;
    }

}
