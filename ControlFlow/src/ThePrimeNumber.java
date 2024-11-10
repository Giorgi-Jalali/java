public class ThePrimeNumber {

    public static void main(String[] args) {

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");

        int result = primeNumberCounter(1000);
        System.out.println(result);

        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
        }


    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeNumberCounter(int wholeNumber) {
        int primeNumCount = 0;

        for (int i = 2; i <= wholeNumber; i++) {
            if (isPrime(i)) {
                primeNumCount++;
            }
            if (primeNumCount == 3) {
                break;
            }
        }

        return primeNumCount;
    }
}
