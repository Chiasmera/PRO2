package Opgave4_Opgavens;

public class FoedeVare extends Vare {
    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------
    public FoedeVare (int pris, String navn) {
        super (pris, navn);
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public double beregnMoms() {
        return getPris()*0.05;
    }

}
