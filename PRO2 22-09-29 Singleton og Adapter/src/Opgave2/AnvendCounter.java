package Opgave2;

public class AnvendCounter {
    public static void main(String[] args) {
        System.out.println("Instantier en counter.");
        Counter uniquCounter = Counter.getInstance();
        System.out.println("Counterens ID er: "+uniquCounter);
        System.out.println();

        System.out.println("Instantier en ny counter.");
        uniquCounter = Counter.getInstance();
        System.out.println("Counterens ID er: "+uniquCounter);
        System.out.println("(Den samme)");
        System.out.println();

        System.out.println("Counter er 0. Tæl counter 1 op.");
        uniquCounter.count();
        System.out.println("Counter er nu: " + uniquCounter.getValue());
        System.out.println();

        System.out.println("fordobl counter");
        uniquCounter.times2();
        System.out.println("Counter er nu: " + uniquCounter.getValue());
        System.out.println();

        System.out.println("reset counteren");
        uniquCounter.zero();
        System.out.println("Counter er nu: " + uniquCounter.getValue());
        System.out.println();

    }
}
