package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Skole {

    private String navn;
    private List<Studerende> alleStuderende = new ArrayList<>();

    public Skole (String navn) {
        this.navn = navn;
    }


    public String getNavn () {
        return navn;
    }

    public List<Studerende> getAlleStuderende() {
        return new ArrayList<>(alleStuderende);
    }

    public void addStuderende (Studerende studerende) {
        if (!alleStuderende.contains(studerende)) {
            alleStuderende.add(studerende);
        }
    }

    public void removeStuderende (Studerende studerende) {
        if (alleStuderende.contains(studerende)) {
            alleStuderende.remove(studerende);
        }
    }

    public double gennemsnit () {
        double sum = 0;
        int number = 0;

        for (Studerende s : alleStuderende) {
            sum += s.gennemsnit();
            number++;
        }

        return sum / number;
    }

    public Studerende findStudent (int studieNr) {
        Studerende fundetStuderende = null;

        for (Studerende s : alleStuderende) {
            if (studieNr == s.getStudieNr()) {
                fundetStuderende = s;
            }
        }
        return fundetStuderende;
    }

    @Override
    public String toString() {
        return navn+": "+alleStuderende;
    }
}
