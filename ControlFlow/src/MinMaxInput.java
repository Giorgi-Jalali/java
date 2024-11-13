import java.util.Scanner;

public class MinMaxInput {
    public static void main(String[] args) {

        minMaxInput();
    }

    public static void minMaxInput() {

        Scanner scanner = new Scanner(System.in);

        double min = 0;
        double max = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Please enter number! or any other character to exit!");
            String nextEntry = scanner.nextLine();

            try {
                double validNumber = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNumber < min) {
                    min = validNumber;
                }
                if (loopCount == 0 || validNumber > max) {
                    max = validNumber;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }

            if (loopCount > 0) {
                System.out.println("min = " + min + ", max = " + max);
            } else {
                System.out.println("No valid data entered");
            }
        }

        System.out.println("Minimum number is: " + min + " and maximum number is: " + max);
    }
}











