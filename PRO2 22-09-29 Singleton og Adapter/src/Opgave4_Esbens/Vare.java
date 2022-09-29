package Opgave4_Esbens;

public abstract class Vare implements Opgave4_Esbens.VareI {
    //Fields ---------------------------------------------------------------------------------------------------------
    private int pris;
    private String navn;

    //Constructors ---------------------------------------------------------------------------------------------------

    public Vare(int pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    @Override
    public int getPris() {
        return pris;
    }

    @Override
    public void setPris(int pris) {
        this.pris = pris;
    }

    @Override
    public String getNavn() {
        return navn;
    }

    @Override
    public void setNavn(String navn) {
        this.navn = navn;
    }


}
