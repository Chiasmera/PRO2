package opgave4;

public class Ackermann {

    public static int ackermannFunction (int x, int y) {
        int result = 0;

        if ( x == 0) {
            result = y+1;
        } else if (y == 0) {
            result = ackermannFunction(x-1, 1);
        } else {
            result = ackermannFunction(x-1, ackermannFunction(x, y-1));
        }

        return result;
    }
}
