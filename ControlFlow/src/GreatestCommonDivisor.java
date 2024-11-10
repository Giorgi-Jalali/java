public class GreatestCommonDivisor {
    // write code here

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int min = first > second ? second : first;
        int gcd = 1;

        for (int i = min; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}
