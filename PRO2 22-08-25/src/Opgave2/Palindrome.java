package Opgave2;

public class Palindrome {
    public static boolean isPalindrome (String text) {
        int firstIndex = 0;
        int lastIndex = text.length()-1;

        return compareLetters(text, firstIndex, lastIndex);

    }

    private static boolean compareLetters (String text, int firstIndex, int lastIndex) {
        boolean result = false;

        if (firstIndex >= lastIndex) {
            result = true;
        } else {
            if (text.charAt(firstIndex) == text.charAt(lastIndex)) {
                result = compareLetters(text, firstIndex+1,lastIndex-1);
            } else {
                result = false;
            }
        }

        return result;
    }
}
