import java.util.ArrayList;

public class Bogtitel implements Subject {
    //Fields ---------------------------------------------------------------------------------------------------------

    private String titel;
    private int antal;

    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Kunde> kunder = new ArrayList<>();

    //Constructors ---------------------------------------------------------------------------------------------------
    public Bogtitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public ArrayList<Observer> getObservers() {
        return new ArrayList<>(observers);
    }

    @Override
    public void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    public ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public void addKunde(Kunde k) {
        if (!kunder.contains(k)) {
            kunder.add(k);
            k.addBogtitel(this);
        }
    }

    public void removeKunde(Kunde k) {
        if (kunder.contains(k)) {
            kunder.remove(k);
            k.removeBogtitel(this);
        }
    }

    //Methods - Other ------------------------------------------------------------------------------------------------

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    public void etKoeb(Kunde k) {
        addKunde(k);
        antal--;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }


}



