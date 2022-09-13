package Opgave3;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {
    @Override
    public int compare(Studerende s1, Studerende s2) {
        int value = 0;
        if (s1.getNavn().compareTo(s2.getNavn()) < 0) {
            value = -1;
        } else if (s1.getNavn().compareTo(s2.getNavn()) > 0) {
            value = 1;
        }
        return value;
    }
}
