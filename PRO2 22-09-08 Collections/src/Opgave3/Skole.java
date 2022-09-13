package Opgave3;

import java.util.HashMap;
import java.util.Map;

public class Skole {

    private String navn;
    private Map<Integer, Studerende> alleStuderende = new HashMap<>();

    public Skole (String navn) {
        this.navn = navn;
    }


    public String getNavn () {
        return navn;
    }

    public HashMap<Integer, Studerende> getAlleStuderende() {
        return new HashMap<>(alleStuderende);
    }

    public void addStuderende (Integer studieNr, Studerende studerende) {
        if (!alleStuderende.containsKey(studieNr)) {
            alleStuderende.put(studieNr, studerende);
        }
    }

    public void removeStuderende (Integer studieNr) {
        if (!alleStuderende.containsKey(studieNr)) {
            alleStuderende.remove(studieNr);
        }
    }

    public double gennemsnit () {
        double sum = 0;
        int number = 0;

        for (Studerende s : alleStuderende.values()) {
            sum += s.gennemsnit();
            number++;
        }

        return sum / number;
    }

    public Studerende findStudent (int studieNr) {
        Studerende fundetStuderende = null;

        for (Studerende s : alleStuderende.values()) {
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
