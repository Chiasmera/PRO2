package Opgave4_Esbens;

public class FoedeVare extends Opgave4_Esbens.Vare {
    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------
    public FoedeVare (int pris, String navn) {
        super (pris, navn);
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public double beregnMoms() {
        return 0;
    }

}
