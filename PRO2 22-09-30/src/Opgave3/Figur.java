package Opgave3;

public abstract class Figur {
    //Fields ---------------------------------------------------------------------------------------------------------
    private String navn;

    //Constructors ---------------------------------------------------------------------------------------------------
    public Figur(String navn) {
        this.navn = navn;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }


    //Methods - Other ------------------------------------------------------------------------------------------------
    public abstract void tegn();

    public abstract double getAreal();

    //Metoder for Composite mønstret ---------------------------------------------------------------------------------
    public abstract void add(Figur f);

    public abstract void remove(Figur f);

    public abstract Figur getChild(int index);

}
