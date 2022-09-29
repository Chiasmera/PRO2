package Opgave5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ObservableBag implements Bag, Iterable<String>  {

    //Fields ---------------------------------------------------------------------------------------------------------
   private HashMap<String, Integer> hashmap = new HashMap<>();
   private ArrayList<Observer> observers = new ArrayList<>();


    //Constructors ---------------------------------------------------------------------------------------------------
    public ObservableBag () {
        createNewHashMap();
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------
    public HashMap<String, Integer> createNewHashMap () {
        hashmap = new HashMap<>();
        return hashmap;
    }

    public HashMap<String, Integer> getHashmap() {
        return new HashMap<>( hashmap);
    }
    
    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public void add(String s) {
        if (hashmap.containsKey(s)) {
            hashmap.put(s, hashmap.get(s)+1);
        } else {
            hashmap.put(s, 1);
        }
        notifyObservers(s, getCount(s));
    }

    @Override
    public void remove(String s) {
        if (hashmap.containsKey(s)) {
            hashmap.remove(s);
        }
        notifyObservers(s, getCount(s));

    }

    @Override
    public int getCount(String s) {
        return hashmap.get(s);
    }

    @Override
    public void registerObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver( Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return Iterable.super.spliterator();
    }

    public void notifyObservers (String s, int antal) {
        for (Observer o : observers) {
            o.update(s, antal);
        }
    }
}
