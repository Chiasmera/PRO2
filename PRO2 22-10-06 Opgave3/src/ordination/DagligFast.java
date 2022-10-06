package ordination;

import java.time.LocalDate;
import java.time.LocalTime;

public class DagligFast extends Ordination {


    //Komposition til Dosis klassen, hvor index 0=Morgen, 1=Middag, 2=Aften og 3=Nat
    private Dosis[] doser = new Dosis[4];

    //Constructor
    public DagligFast (LocalDate startDato, LocalDate slutDato, Patient patient) {
        super(startDato, slutDato, patient);
    }

    public Dosis[] getDoser() {
        return doser.clone();
    }

    /**
     * Returnerer den totale dosis der er givet i den periode ordinationen er gyldig
     * @return Returnerer den totale dosis for perioden
     */
    @Override
    public double samletDosis() {
        return doegnDosis() * antalDage();
    }

    /**
     * Returnerer den gennemsnitlige dosis givet pr dag i den periode ordinationen er gyldig
     * @return Returnerer gennemsnitlig dosis for perioden
     */
    @Override
    public double doegnDosis() {
        //Beregn doser pr dag (Hvilket også er gennemsnittet pr dag, fordi den er fast)
        int antalDoser = 0;
        for (Dosis d : doser) {
            if (d != null) {
                antalDoser += d.getAntal();
            }
        }

        //returner doser gange dage
        return antalDoser;
    }

    /**
     * Returnerer ordinationstypen som en String
     * @return Returnerer ordinationstypen som en String
     */
    @Override
    public String getType() {
        return "Daglig Fast";
    }

    /**
     * Opretter en ny dosis og tilføjer den til doses arrayet
     *
     * @param tid   Tiden hvorpå dosen blive taget
     * @param antal mængde af dosen der bliver tager
     * @return Returnerer den nyligt oprettede dosis
     */
    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis nyDosis = new Dosis(tid, antal);

        if (tid.isAfter(LocalTime.of(17,59))) {
            doser[2] = nyDosis;
        }else if (tid.isAfter(LocalTime.of(11,59))) {
            doser[1] = nyDosis;
        } else if (tid.isAfter(LocalTime.of(5,59))) {
            doser[0] = nyDosis;
        } else {
            doser[3] = nyDosis;
        }


        return nyDosis;
    }

}
