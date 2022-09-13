package Opgave2;

public class App {
    public static void main(String[] args) {
        Skole skole1 = new Skole("Gurrevejen Skole");

        Studerende s1 = new Studerende(1, "Hans");
        Studerende s2 = new Studerende(2, "Ole Lukøje");
        Studerende s3 = new Studerende(3, "Frederik");
        Studerende s4 = new Studerende(4, "Julemanden");
        Studerende s5 = new Studerende(5, "Julius");
        Studerende s6 = new Studerende(6, "Viggo");
        Studerende s7 = new Studerende(7, "Odyseus");
        Studerende s8 = new Studerende(8, "Homer");
        Studerende s9 = new Studerende(9, "Thor");

        skole1.addStuderende(s1);
        skole1.addStuderende(s2);;
        skole1.addStuderende(s3);
        skole1.addStuderende(s4);
        skole1.addStuderende(s5);
        skole1.addStuderende(s6);
        skole1.addStuderende(s7);
        skole1.addStuderende(s8);
        skole1.addStuderende(s9);

        System.out.println(skole1);
    }
}
