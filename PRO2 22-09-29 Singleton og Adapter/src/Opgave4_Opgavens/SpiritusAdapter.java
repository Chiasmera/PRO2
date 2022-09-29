package Opgave4_Opgavens;

import Opgave4_Esbens.Spiritus;
import Opgave4_Esbens.Vare;

public class SpiritusAdapter extends Vare {


    //Fields ---------------------------------------------------------------------------------------------------------
    Spiritus spiritus;

    //Constructors ---------------------------------------------------------------------------------------------------
    public SpiritusAdapter(int pris, String navn, Spiritus spiritus) {
        super(pris, navn);
        this.spiritus = spiritus;
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public double beregnMoms() {
        return spiritus.hentMoms();
    }

}
