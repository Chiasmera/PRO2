package Opgave2;

public class Chili implements Measurable {

    //Fields ---------------------------------------------------------------------------------------------------------
    private String name;
    private double severity;

    //Constructors ---------------------------------------------------------------------------------------------------

    public Chili(String name, double severity) {
        this.name = name;
        this.severity = severity;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public double getSeverity() {
        return severity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeverity(double severity) {
        this.severity = severity;
    }

    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public double getMeasure() {
        return getSeverity();
    }

    @Override
    public String toString() {
        return name+"["+severity+"]";
    }
}
