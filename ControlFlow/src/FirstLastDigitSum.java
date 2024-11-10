public class FirstLastDigitSum {
    // write code here

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int last = number % 10;

        while (number >= 10) {

            number /= 10;
        }

        int first = number % 10;

        return first + last;
    }
}
