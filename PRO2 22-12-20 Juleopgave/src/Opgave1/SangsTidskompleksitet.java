package Opgave1;

public class SangsTidskompleksitet {


    /**
     * Beregner antal totale linjer i en sang med given antal vers, og en struktur som "the twelve days of christman"
     * @param antalVers Antal vers i sangen
     * @return totale antallet af linjer i sangen
     */
    public int beregnAntalLinjer (int antalVers) {
        return beregnAntalLinjerAf(antalVers);
    }

    /**
     * Hjælpemetode til beregning af antal totale linjer i en sang med given antal vers, og en struktur som "the twelve days of christman"
     * @param versNr Antal vers i sangen
     * @return totale antal linjer i sangen
     */
    private int beregnAntalLinjerAf (int versNr) {
        int result = 0;
        if (versNr > 0) {
            result = (1 + versNr) + beregnAntalLinjerAf( versNr-1);
        }
                return result;
    }
}
