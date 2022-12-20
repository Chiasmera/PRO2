package Opgave2;

public class Main {
    //Fields ------------------------------------------------------------


    //Constructors ------------------------------------------------------


    //Methods - Get, Set & Add -------------------------------------------


    //Methods - Other ----------------------------------------------------
    public static void main(String[] args) {

        double oelPris = 6;
        double pant = 1;
        OelButik butik = new OelButik(oelPris, pant);

        double startBeloeb1 = 650;
        double startBeloeb2 = 8000;
        int oenskedeOel = 200;

        System.out.println("Linær metode:");
        System.out.println("For "+startBeloeb1+ " kr. kan der købes følgende antal øl:");
        System.out.println(butik.koebOelLineart(startBeloeb1));
        System.out.println();
        System.out.println("For "+startBeloeb2+ " kr. kan der købes følgende antal øl:");
        System.out.println(butik.koebOelLineart(startBeloeb2));
        System.out.println();
        System.out.println("______________________________________________________________________");
        System.out.println();

        System.out.println("Rekursiv metode:");
        System.out.println("For "+startBeloeb1+ " kr. kan der købes følgende antal øl:");
        System.out.println(butik.koebOelRekursivt(startBeloeb1));
        System.out.println();
        System.out.println("For "+startBeloeb2+ " kr. kan der købes følgende antal øl:");
        System.out.println(butik.koebOelRekursivt(startBeloeb2));
        System.out.println();
        System.out.println("_______________________________________________________________________");
        System.out.println();

        System.out.println("Hvis der skal købes "+oenskedeOel+" øl, til prisen: "+butik.getPris()+" på én gang, og panten derefter indløses til penge, betaler man:");
        System.out.println(butik.prisForOel(oenskedeOel));
        System.out.println();

        System.out.println("Øl købes enkeltvist, og når der er nok pant til en ny øl indløses det med det samme (til en gratis øl).");
        System.out.println("Der købes "+oenskedeOel+" øl, og til sidst er der brugt:");
        System.out.println(butik.prisForOelEnkeltvistKøbt(oenskedeOel));

    }
}
