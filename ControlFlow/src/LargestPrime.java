public class LargestPrime {
    // write code here

    public static void main(String[] args) {
        getLargestPrime(50);
    }

    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        }

        int factor = -1;
        for(int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }

            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }
}