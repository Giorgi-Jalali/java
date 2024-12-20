public class NumberPalindrome {
    // write code here

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        int num = number;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return reverse == number;
    }
}