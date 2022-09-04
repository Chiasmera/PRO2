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

    private static int flyt(int ringe, int startRing, int endRing) {
        int result = 0;

        int mellemstation = 6-startRing-endRing;

        if (ringe == 1) {
            result = 1;
        } else {
            result = result + flyt(ringe-1, startRing, mellemstation);
            result = result + flyt(1,startRing, endRing); //effektivt bare result++
            result = result + flyt(ringe-1,mellemstation,endRing);
        }

        return result;
    }
}
