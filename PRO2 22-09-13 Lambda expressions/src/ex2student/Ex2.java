package ex2student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();


        //Opgave 2.A
		System.out.println("Print alle løbere med navn og tid");
        Consumer<Runner> nameTime = (r) -> System.out.println("Navn: " + r.getName() + ", Laptime: " + r.getLapTime());
        runners.forEach(nameTime);
		System.out.println();

        //Opgave 2.B
		System.out.println("Print alle løbere med tid under 30");
        Consumer<Runner> nameTimeLessthan30 = (r) -> {
            if (r.getLapTime() < 30) {
                System.out.println("Navn: " + r.getName() + ", Laptime: " + r.getLapTime());
            }
        };
        runners.forEach(nameTimeLessthan30);
		System.out.println();

        //Opgave 2.C
		System.out.println("sorter løbere stigende, og udskriv");
		System.out.println("løbere før:");
		System.out.println(runners);
		Comparator<Runner> sortByLaptime = (r1, r2) -> r1.getLapTime() - r2.getLapTime();
		runners.sort(sortByLaptime);
		System.out.println("løbere efter:");
		System.out.println(runners);
		System.out.println();
    }
}
