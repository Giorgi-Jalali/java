public class Sum3And5 {

    public static void main(String[] args) {

        int sumOf3And5 = 0;
        int count = 0;

        for (int i = 1; count < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " is divided by 3 and 5");
                sumOf3And5 += i;
                count++;
            }
        }

        System.out.println("Sum of first 5 numbers is " + sumOf3And5);
    }
}
