package Opgave5;

public class TowerOfHanoi {

    public static int antalFlytninger (int ringe) {
        int result = 0;

        if (ringe == 1) {
            result = 1;
        } else {
            result = flyt(ringe, 1, 3);
        }

        return result;
    }

    private static int flyt(int ringe, int from, int to) {
        int result = 0;
        int mellemstation = 6-from-to;

        if (ringe == 1) {
            result = 1;
        } else {
            result = result + flyt(ringe-1, from, mellemstation);
            result = result + flyt(1,from, to); //kan udskiftes med result++
            result = result + flyt(ringe-1,mellemstation,to);
        }

        return result;
    }
}
