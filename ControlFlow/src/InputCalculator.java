import java.util.Scanner;

public class InputCalculator {
    // write code here

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                break;
            }

            sum += scanner.nextInt();
            count++;
            scanner.nextLine();
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}