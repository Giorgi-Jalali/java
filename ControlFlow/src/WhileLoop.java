public class WhileLoop {
    public static void main(String[] args) {

        int num = 4;
        int end = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (num <= end) {
            num++;
            if (!isEvenNumber(num)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number: " + num);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Even numbers count: " + evenCount + " and odd numbers count " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
