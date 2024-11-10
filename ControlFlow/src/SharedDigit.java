public class SharedDigit {
    // write code here

    public static boolean hasSharedDigit (int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int firstLeft = num1 / 10;
        int firstRight = num1 % 10;
        int secondLeft = num2 / 10;
        int secondRight = num2 % 10;

        boolean firstShared = firstLeft == secondLeft || firstLeft == secondRight;
        boolean secondShared = firstRight == secondLeft || firstRight == secondRight;

        return firstShared || secondShared;
    }
}