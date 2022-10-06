package Opgave2;

import Opgave1.Chili;
import Opgave1.Measurable;

public class App {
    public static void main(String[] args) {
        Opgave1.Chili[] chilis = new Opgave1.Chili[5];
        Opgave1.Chili c1 = new Opgave1.Chili("Cayenne", 30000 );
        Opgave1.Chili c2 = new Opgave1.Chili("Manzano", 15000 );
        Opgave1.Chili c3 = new Opgave1.Chili("Serrano", 5000 );
        Opgave1.Chili c4 = new Opgave1.Chili("Jalapeno", 2500 );
        Opgave1.Chili c5 = new Opgave1.Chili("Pure Capsaicin", 16000000 );
        chilis[0] = c1;
        chilis[1] = c2;
        chilis[2] = c3;
        chilis[3] = c4;
        chilis[4] = c5;

        Filter over5000 = (x) -> ((Measurable) x).getMeasure() > 5000;

        System.out.println("Print chili array");
        for (Chili c : chilis) {
            System.out.println(c);
        }
        System.out.println();

        System.out.println("Print chili with highest severity");
        System.out.println(max(chilis, over5000));
        System.out.println();

        System.out.println("Print severity average");
        System.out.println(avg(chilis, over5000));
        System.out.println();
    }

    public static Measurable max(Measurable[] objects, Filter filter) {
        Measurable highestObject = objects[0];
        for (int i = 1; i< objects.length; i++) {
            if (filter.accept(objects[i])) {
                if (objects[i].getMeasure() > highestObject.getMeasure()) {
                    highestObject = objects[i];
                }
            }
        }
        return highestObject;
    }

    public static double avg(Measurable[] objects, Filter filter) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < objects.length; i++) {
            if (filter.accept(objects[i])) {
                sum += objects[i].getMeasure();
                count++;
            }
        }
        return sum / count;
    }

}
