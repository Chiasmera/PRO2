package Opgave3;

import java.util.*;

public class IteratorFun {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(28);
        list.add(93);
        list.add(56);
        System.out.println("tjekliste: " + list);
        System.out.println();

        //3.A   Print listen med en iterator
        System.out.println("Print liste med en iterator");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            System.out.println(current);
        }

        //3.B   Lav map med parrene, og udskriv parrene med iterator
        System.out.println("Lav et map med par, og udskriv parrene med en iterator");
        Map<Integer, Integer> pairMap = new HashMap<>();
        pairMap.put(2,4);
        pairMap.put(3,9);
        pairMap.put(4,16);
        pairMap.put(5,25);
        pairMap.put(6,36);


        Set<Integer> keys = pairMap.keySet();
        Iterator<Integer> mapIterator = keys.iterator();

        while (mapIterator.hasNext()) {
            Integer key = mapIterator.next();
            System.out.println(key + "," + pairMap.get(key));
        }
    }
}
