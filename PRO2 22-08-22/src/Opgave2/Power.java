package Opgave2;

public class Power {

    public static int power(int n, int p) {
        int result = 0;

        if (p == 0) {
            result = 1;
        } else  {
            result = power(n,p-1)*n;
        }

        return result;
    }

    public static int power2(int n, int p) {
        int result = 0;

        if (p == 0) {
            result = 1;
        } else  {
            if (p % 2 != 0) {
                result = power(n,p-1)*n;
            } else {
                result = power(n*n, p/2);
            }
        }

        return result;
    }
}
