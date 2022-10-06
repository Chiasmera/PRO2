package ordination;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DagligSkaev extends Ordination {
    ArrayList<Dosis> doser = new ArrayList<>();


    /**
     * Opretter en ny daglig skæv ordination
     * @param startDate Datoen for første dosis
     * @param slutDate Datoen for den sidste dosis
     * @param patient Patienten som får ordineret denne ordination
     */
    public DagligSkaev(LocalDate startDate, LocalDate slutDate, Patient patient) {
        super(startDate, slutDate, patient);
    }

    public ArrayList<Dosis> getDoser() {
        return new ArrayList<>( doser);
    }

    /**
     * Opretter en ny dosis
     * @param tid Tiden denne dosis er givet
     * @param antal antal enheder givet i denne dosis
     * @return returnerer den nyligt oprettede dosis
     */
    public Dosis opretDosis(LocalTime tid, double antal) {
        Dosis nyDosis = new Dosis(tid, antal);
        doser.add(nyDosis);
        return nyDosis;
    }


    /**
     * Returnerer den totale dosis der er givet i den periode ordinationen er gyldig
     * @return
     */
    @Override
    public double samletDosis() {
        return doegnDosis() * antalDage();
    }

    /**
     * Returnerer den gennemsnitlige dosis givet pr dag i den periode ordinationen er gyldig
     * @return
     */
    @Override
    public double doegnDosis() {
        double totalDoser = 0.0;
        for (Dosis d : doser) {
            totalDoser += d.getAntal();
        }
        return totalDoser;
    }

    @Override
    public String getType() {
        return "Daglig skæv";
    }
}
