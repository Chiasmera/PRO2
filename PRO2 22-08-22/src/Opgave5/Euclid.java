package Opgave5;

public class Euclid {

    public static int fællesDivisor(int a, int b) {
        int result = 0;

        if (b <= a && a % b == 0) {
            result = b;
        } else {
            if (a < b) {
                result = fællesDivisor(b, a);
            } else {
                result = fællesDivisor(b, a % b);
            }
        }

        return result;
    }
}
