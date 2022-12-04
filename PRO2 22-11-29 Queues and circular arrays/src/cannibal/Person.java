package cannibal;

public class Person {
    //Fields ---------------------------------------------------------------------------------------------------------
    private String name;
    private String state;

    //Constructors ---------------------------------------------------------------------------------------------------

    public Person(String name, String state) {
        this.name = name;
        this.state = state;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }


    //Methods - Other ------------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return name + " som er meget "+state;
    }
}
