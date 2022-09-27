public class Indkoeber implements Observer {
    //Fields ---------------------------------------------------------------------------------------------------------
private String navn;


    //Constructors ---------------------------------------------------------------------------------------------------

    public Indkoeber(String navn) {
        this.navn = navn;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public String getNavn() {
        return navn;
    }




    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public void update(Subject s) {
        Bogtitel b = null;
        if (s instanceof Bogtitel) {
            b  = (Bogtitel) s ;
        }


        if ( b != null && b.getAntal() < 6 ) {
            System.out.println("Lagerbeholdning af "+b.getTitel()+ " er lav. 10 nye eksemplarer er købt");
            b.indkoebTilLager(10);
        }

    }

}
