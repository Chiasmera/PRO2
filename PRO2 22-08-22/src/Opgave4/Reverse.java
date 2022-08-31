package Opgave4;

public class Reverse {

    public static String reverse(String s) {
        String result = "";

        if (s.length() == 1) {
            result ="" + s.charAt(0) ;
        } else {
            result = reverse(s.substring(1)) + s.charAt(0);
        }

        return result;
    }
}
