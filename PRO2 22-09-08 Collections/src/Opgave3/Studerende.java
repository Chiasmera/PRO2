package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Studerende implements Comparable<Studerende> {

    private Integer studieNr;
    private String navn;
    private List<Integer> karakterer = new ArrayList<>();;

    public Studerende (Integer studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public List<Integer> getKarakterer() {
        return new ArrayList<>(karakterer);
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter (Integer karakter) {
        if (!karakterer.contains(karakter)) {
            karakterer.add(karakter);
        }
    }

    public void removeKarakter (Integer karakter) {
        if (karakterer.contains(karakter)) {
            karakterer.remove(karakter);
        }
    }

    public double gennemsnit () {
        double sum = 0;
        int number = 0;
        for (Integer k : karakterer) {
            sum =+ k;
            number++;
        }
        return sum / number;
    }

    @Override
    public String toString() {
        return navn + " ("+studieNr+")";
    }

    @Override
    public int compareTo(Studerende s) {
        return studieNr - s.studieNr;
    }
}
