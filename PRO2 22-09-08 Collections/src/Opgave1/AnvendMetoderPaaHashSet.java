package Opgave1;

import java.util.HashSet;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {

        //Opret hashset
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(34);
        hashSet.add(12);
        hashSet.add(23);
        hashSet.add(45);
        hashSet.add(67);
        hashSet.add(34);
        hashSet.add(98);
        System.out.println(hashSet);

        hashSet.add(23);
        System.out.println(hashSet);

        hashSet.remove(67);
        System.out.println(hashSet);

        System.out.println("Indeholder settet 23?");
        System.out.println(hashSet.contains(23));

        System.out.println(hashSet.size());
    }
}
