package Opgave1;

import java.util.HashSet;
import java.util.Set;

public class App {
    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Set<Bil> bilSet = new HashSet<>();

        Bil bil1 = new Bil("BK95661", "Skoda", "Citygo", "Sort");
        Bil bil2 = new Bil("UG84227", "Kia", "Picanto", "Orange");
        Bil bil3 = new Bil("MURICA69", "Humvee", "Freedomclass", "Guld");
        Bil bil4 = new Bil("BK95661", "Skoda", "Citygo", "Sort");
        Bil bil5 = new Bil("MURICA69", "Humvee", "Freedomclass", "Guld");

        bilSet.add(bil1);
        bilSet.add(bil2);
        bilSet.add(bil3);
        bilSet.add(bil4);
        bilSet.add(bil5);


        System.out.println(bilSet);
    }

}
