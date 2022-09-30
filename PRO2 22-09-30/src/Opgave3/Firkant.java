package Opgave3;

public class Firkant extends Figur {

    //Fields ---------------------------------------------------------------------------------------------------------
    private double længde;
    private double bredde;

    //Constructors ---------------------------------------------------------------------------------------------------

    public Firkant(String navn, double længde, double bredde) {
        super(navn);
        this.længde = længde;
        this.bredde = bredde;
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
        return længde * bredde;
    }

}
