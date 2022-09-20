import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class BiblioteksBøde {
    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     * beregnetDato < faktiskDato
     * (beregnetDato er forventet afleveringsdato og
     * faktiskDato er den dag bogen blev afleveret; voksen er
     * sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        ArrayList<Integer> boedepriser = new ArrayList<>();
        if (voksen) {
            boedepriser.add(20);
            boedepriser.add(60);
            boedepriser.add(90);
        } else {
            boedepriser.add(10);
            boedepriser.add(30);
            boedepriser.add(45);
        }

        long overskridelse = ChronoUnit.DAYS.between(beregnetDato, faktiskDato);
        int bøde;

        if (overskridelse > 0 && overskridelse < 8) {
            bøde = boedepriser.get(0);
        } else if (overskridelse < 15) {
            bøde = boedepriser.get(1);
        } else {
            bøde = boedepriser.get(2);
        }

        return bøde;
    }

}
