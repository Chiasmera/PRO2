package Opgave3;

public class Trekant extends Figur {

    //Fields ---------------------------------------------------------------------------------------------------------
    private double grundlinje;
    private double højde;

    //Constructors ---------------------------------------------------------------------------------------------------
    public Trekant(String navn, double grundlinje, double højde) {
        super(navn);
        this.grundlinje = grundlinje;
        this.højde = højde;
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
        return grundlinje * højde;
    }

}
