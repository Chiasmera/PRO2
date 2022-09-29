package Opgave4_Opgavens;

public class ElVare extends Vare {

    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------
    public ElVare (int pris, String navn) {
        super(pris, navn);
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public double beregnMoms() {
        double value = 3;
        if (getPris()*0.3 > 3) {
            value = getPris() * 0.3;
        }
        return value;
    }

}
