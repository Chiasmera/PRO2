package Opgave3;

public class App {
    public static void main(String[] args) {
        Figur hus = new SammensatFigur("Hus");
        Figur sol = new SammensatFigur("Sol");
        sol.add(new Elipse("Sol-cirkel", 20, 20));
        sol.add(new Firkant("Solstråle", 20,1));
        hus.add(sol);
        hus.add(new Trekant("Tag", 50, 30));
        hus.add(new Firkant("Mur", 50, 50));

        System.out.println("Udskriv hus-tegningens totale areal");
        System.out.println(hus.getAreal());
        System.out.println();
        System.out.println("\"Tegn\" huset");
        hus.tegn();



    }
}
