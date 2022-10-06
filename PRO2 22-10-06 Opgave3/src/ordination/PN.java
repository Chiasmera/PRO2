package ordination;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class PN extends Ordination {

    private double antalEnheder;
    private ArrayList<LocalDate> dosisDatoer = new ArrayList<>();

    /**
     * Opretter ordination af typen PN
     * @param startDen er sidste dag patient får medicin
     * @param slutDen  er første dag patient får medicin
     */
    public PN(LocalDate startDen, LocalDate slutDen, double antalEnheder, Patient patient) {
        super(startDen, slutDen, patient);
        this.antalEnheder = antalEnheder;
    }


    /**
     * Registrerer at der er givet en dosis paa dagen givesDen
     * Returnerer true hvis givesDen er inden for ordinationens gyldighedsperiode og datoen huskes
     * Retrurner false ellers og datoen givesDen ignoreres
     * @param givesDen den dato dosis bliver givet
     * @return returnerer true hvis datoen ligger indenfor den gyldige periode
     */
    public boolean givDosis(LocalDate givesDen) {
        boolean gyldig = false;
        if (givesDen.isAfter(super.getStartDen().minusDays(1)) && givesDen.isBefore(super.getSlutDen().plusDays(1))) {
            dosisDatoer.add(givesDen);
            gyldig = true;
        }
        return gyldig;
    }

    /**
     * Beregner dosis pr døgn i perioden
     * @return Returnerer den gennemsnitlige dosis i døgnet over hele den gyldige periode
     */
    public double doegnDosis() {
        LocalDate startDato = dosisDatoer.get(0);
        LocalDate slutDato = dosisDatoer.get(dosisDatoer.size()-1);
        return samletDosis() / (ChronoUnit.DAYS.between(startDato, slutDato)+1);
    }

    @Override
    public String getType() {
        return "PN";
    }


    /**
     * Returnerer den totale dosis der er givet i den periode ordinationen er gyldig
     * @return returneer den totale dosismængde for perioden
     */
    public double samletDosis() {
        return getAntalGangeGivet() * antalEnheder;
    }

    /**
     * Returnerer antal gange ordinationen er anvendt
     * @return antal gange dosis er givet
     */
    public int getAntalGangeGivet() {
        return dosisDatoer.size();
    }

    public ArrayList<LocalDate> getDosisDatoer() {
        return new ArrayList<LocalDate>(dosisDatoer);
    }

    public double getAntalEnheder() {
        return antalEnheder;
    }

}
