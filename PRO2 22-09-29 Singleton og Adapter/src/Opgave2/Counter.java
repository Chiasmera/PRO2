package Opgave2;

public class Counter {
    //Fields ---------------------------------------------------------------------------------------------------------
    private static Counter uniqueInstance;
    private int value;

    //Constructors ---------------------------------------------------------------------------------------------------
    private Counter () {
        this.value = 0;
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------
    public static Counter getInstance () {
        if (uniqueInstance == null) {
            uniqueInstance = new Counter();
        }
        return uniqueInstance;
    }

    //Methods - Other ------------------------------------------------------------------------------------------------
    public void count() {
        value++;
    }

    public void times2 () {
        value *= 2;
    }

    public void zero () {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
