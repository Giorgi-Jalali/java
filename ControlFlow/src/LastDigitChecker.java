public class LastDigitChecker {
    // write code here

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        return aLast == bLast || aLast == cLast || bLast == cLast;
    }
}
