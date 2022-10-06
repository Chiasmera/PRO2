package Opgave1;

public class App {
    public static void main(String[] args) {

        Chili[] chilis = new Chili[5];
        Chili c1 = new Chili("Cayenne", 30000 );
        Chili c2 = new Chili("Manzano", 15000 );
        Chili c3 = new Chili("Serrano", 5000 );
        Chili c4 = new Chili("Jalapeno", 2500 );
        Chili c5 = new Chili("Pure Capsaicin", 16000000 );
        chilis[0] = c1;
        chilis[1] = c2;
        chilis[2] = c3;
        chilis[3] = c4;
        chilis[4] = c5;

        System.out.println("Print chili array");
        for (Chili c : chilis) {
            System.out.println(c);
        }
        System.out.println();

        System.out.println("Print chili with highest severity");
        System.out.println(max(chilis));
        System.out.println();

        System.out.println("Print chili array");
        System.out.println(avg(chilis));
        System.out.println();

    }

    public static Measurable max(Measurable[] objects) {
        Measurable highestObject = objects[0];
        for (int i = 1; i< objects.length; i++) {
            if (objects[i].getMeasure() > highestObject.getMeasure()) {
                highestObject = objects[i];
            }
        }
        return highestObject;
    }

    public static double avg(Measurable[] objects) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
            count++;
        }
        return sum / count;
    }
}
