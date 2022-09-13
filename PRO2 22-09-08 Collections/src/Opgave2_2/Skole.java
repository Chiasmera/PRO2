package Opgave2_2;

import java.util.HashSet;
import java.util.Set;

public class Skole {

    private String navn;
    private Set<Studerende> alleStuderende = new HashSet<>();

    public Skole (String navn) {
        this.navn = navn;
    }


    public String getNavn () {
        return navn;
    }

    public HashSet<Studerende> getAlleStuderende() {
        return new HashSet<>(alleStuderende);
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
