public class DecimalComparator {
    // write code here

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        long newNum1 = (long) (num1 * 1000);
        long newNum2 = (long) (num2 * 1000);

        return newNum1 == newNum2;
    }
}
