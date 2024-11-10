public class NumberToWords {
    // write code here

    public static int reverse(int number) {

        int reversedNum = 0;

        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number /= 10;
        }

        return reversedNum;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int num = reverse(number);
        int count = getDigitCount(number);

        String words = "";

        if (number == 0) {
            words += "Zero";
        } else {
            for (int i = 0; i < count; i++) {

                switch (num % 10) {
                    case 0 -> words += "Zero ";
                    case 1 -> words += "One ";
                    case 2 -> words += "Two ";
                    case 3 -> words += "Three ";
                    case 4 -> words += "Four ";
                    case 5 -> words += "Five ";
                    case 6 -> words += "Six ";
                    case 7 -> words += "Seven ";
                    case 8 -> words += "Eight ";
                    case 9 -> words += "Nine ";
                }

                num /= 10;
            }
        }

        System.out.println(words);
    }
}