package Opgave4_Opgavens;

public abstract class Vare {
    //Fields ---------------------------------------------------------------------------------------------------------
    private int pris;
    private String navn;

    //Constructors ---------------------------------------------------------------------------------------------------

    public Vare(int pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    //Methods - Other ------------------------------------------------------------------------------------------------

    public abstract double beregnMoms ();

}
