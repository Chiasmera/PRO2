package Opgave3;

public class Elipse extends Figur {

    //Fields ---------------------------------------------------------------------------------------------------------
    private double radius1;
    private double radius2;

    //Constructors ---------------------------------------------------------------------------------------------------

    public Elipse(String navn, double radius1, double radius2) {
        super(navn);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    @Override
    public void add(Figur f) {
        throw new RuntimeException("Simple figurer har ingen children");
    }

    @Override
    public void remove(Figur f) {
        throw new RuntimeException("Simple figurer har ingen children");
    }

    @Override
    public Figur getChild(int index) {
        throw new RuntimeException("Simple figurer har ingen children");
    }

    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public void tegn() {
        System.out.println(getNavn());

    }

    @Override
    public double getAreal() {
        return Math.PI * radius1 * radius2;
    }

}
