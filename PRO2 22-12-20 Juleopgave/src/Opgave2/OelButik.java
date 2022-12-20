package Opgave2;

public class OelButik {
    //Fields ------------------------------------------------------------
    private double pris;
    private double pant;

    //Constructors ------------------------------------------------------
    public OelButik(double pris, double pant) {
        this.pris = pris;
        this.pant = pant;
    }


    //Methods - Get, Set & Add -------------------------------------------

    public double getPris() {
        return pris;
    }


    //Methods - Other ----------------------------------------------------

    /**
     * Beregner hvor mange øl der kan købes for et givent beløb, med en given pris og en given pant. Udregningen laves lineært.
     *
     * @param beloeb Hvor mange penge der kan bruges på Øl
     * @return antallet af øl som kan købes med givne parametre
     */
    public int koebOelLineart(double beloeb) {
        double restPenge = beloeb;
        int antalOel = 0;
        while (restPenge > pris + pant) {
            restPenge -= pris;
            antalOel++;
        }
        return antalOel;
    }

    /**
     * Beregner hvor mange øl der kan købes for et givent beløb, med en given pris og en given pant. Udregningen laves rekursivt.
     *
     * @param beloeb Hvor mange penge der kan bruges på Øl
     * @return antallet af øl som kan købes med givne parametre
     */
    public int koebOelRekursivt(double beloeb) {
        return koebOelForRestbeloeb(beloeb);
    }

    /**
     * Hjælpemetode til at beregne hvor mange øl der kan købes for et givent beløb, med en given pris og en given pant. Udregningen laves rekursivt.
     *
     * @param beloeb Hvor mange penge der kan bruges på Øl
     * @return antallet af øl som kan købes med givne parametre
     */
    private int koebOelForRestbeloeb(double beloeb) {
        int antal = 0;
        if (beloeb > pris + pant) {
            antal += 1 + koebOelRekursivt(beloeb - pris);
        }
        return antal;
    }

    /**
     * Beregner totale mængde brugte penge, for at købe et givent antal øl
     *
     * @param antalOensketOel antallet af ønskede øl
     * @return den udregnede pris for antallet af øl
     */
    public double prisForOel(int antalOensketOel) {
        return pris * antalOensketOel;
    }

    /**
     * Beregner totale mængde brugte penge, for at købe øl enkeltvist og indlevere pant løbende
     *
     * @param oenskedeØl Antallet af ønskede øl
     * @return brugte penge totalt på at købe det ønskede antal øl
     */
    public double prisForOelEnkeltvistKøbt(int oenskedeØl) {
        return prisHvisManErDrankerForOel(oenskedeØl, 0);
    }

    /**
     * Hjælpemetode til at beregne  totale mængde brugte penge, for at købe øl enkeltvist og indlevere pant løbende
     *
     * @param tilbagevaerendeAntalOel Antallet af ønskede øl som er resterende
     * @return brugte penge totalt på at købe det ønskede antal øl
     */
    private double prisHvisManErDrankerForOel(int tilbagevaerendeAntalOel, double pantTjent) {
        double brugtePenge = 0;
        int antalOelTilbage = tilbagevaerendeAntalOel;
        double nuværendePantTjent = pantTjent;

        if (tilbagevaerendeAntalOel > 0) {
            if (nuværendePantTjent >= pris) {
                nuværendePantTjent -= pris;
                antalOelTilbage--;
                brugtePenge += prisHvisManErDrankerForOel(antalOelTilbage, nuværendePantTjent);
            } else {
                antalOelTilbage--;
                nuværendePantTjent += pant;
                brugtePenge += pris + pant + prisHvisManErDrankerForOel(antalOelTilbage, nuværendePantTjent);
            }

        }
        return brugtePenge;
    }


}
