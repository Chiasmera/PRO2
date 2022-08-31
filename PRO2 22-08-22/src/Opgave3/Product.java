package Opgave3;

public class Product {
    public static int product(int a, int b) {
        int result = 0;

        if ( a == 0) {
            result = 0;
        } else {
            result = product(a-1,b)+b;
        }
        return result;
    }

    public static int productRus(int a, int b) {
        int result = 0;

        if ( a == 0) {
            result = 0;
        } else {
            if ( a % 2 != 0) {
                result = product(a-1,b)+b;
            } else {
                result = product(a/2, 2*b);
            }

        }
        return result;
    }
}
