import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {
        double result = userInput();
        System.out.println("Sum: " + result);
    }

    public static double userInput() {

        Scanner scanner = new Scanner(System.in);
        int num = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + num);
            try {

//                sum += Integer.parseInt(scanner.nextLine());
                sum += Double.parseDouble(scanner.nextLine());
                num++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number!!! Try again.");
            }

        } while (num < 6);

        return sum;
    }

}

















