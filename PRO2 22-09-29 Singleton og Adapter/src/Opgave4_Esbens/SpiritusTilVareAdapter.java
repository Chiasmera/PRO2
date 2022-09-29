package Opgave4_Esbens;

public class SpiritusTilVareAdapter implements Opgave4_Esbens.VareI {
    //Fields ---------------------------------------------------------------------------------------------------------

    private Opgave4_Esbens.Spiritus spiritus;

    //Constructors ---------------------------------------------------------------------------------------------------


    public  SpiritusTilVareAdapter (Opgave4_Esbens.Spiritus spiritus) {
        this.spiritus = spiritus;
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------



    @Override
    public int getPris() {
        return spiritus.getPrisen();
    }

    @Override
    public void setPris(int pris) {
        spiritus.setPrisen(pris);
    }

    @Override
    public String getNavn() {
        return spiritus.getBetgenelse();
    }

    @Override
    public void setNavn(String navn) {
        spiritus.setBetgenelse(navn);
    }

    //Methods - Other ------------------------------------------------------------------------------------------------


    @Override
    public double beregnMoms() {
        return spiritus.hentMoms();
    }


}
