package Opgave1;

public class Main {
    //Hvad er tidskompleksiteten på "The Twelve Days of Christmas"?
    /*
    Hvert vers har 1 linje plus 1 linje for hver vers i sangen til dette punkt, inklusive sig selv.
    Dvs 1+n

    dvs at de to første linjer bliver gentaget n gange (i hvert vers), mens tredje linje bliver gentager n-1 gange,
    fjerde n-2 osv
    Antal linjer i sangen vil altid være n!-n

    Tidskompleksistet kan nok nærmest estimeres som O(n^2), da den er eksponentiel

     */
    public static void main(String[] args) {
        SangsTidskompleksitet s1 = new SangsTidskompleksitet();
        int sangVers1 = 12;
        int sangVers2 = 24;
        int sangVers3 = 48;

        System.out.println("Antal totale linjer i sang med "+sangVers1+" linjer er:");
        System.out.println(s1.beregnAntalLinjer(sangVers1));
        System.out.println();
        System.out.println("Antal totale linjer i sang med "+sangVers2+" linjer er:");
        System.out.println(s1.beregnAntalLinjer(sangVers2));
        System.out.println();
        System.out.println("Antal totale linjer i sang med "+sangVers3+" linjer er:");
        System.out.println(s1.beregnAntalLinjer(sangVers3));
        System.out.println();

    }
}
