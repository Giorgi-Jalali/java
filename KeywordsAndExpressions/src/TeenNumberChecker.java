public class TeenNumberChecker {
    // write code here

    public static boolean hasTeen (int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int age) {
        return age > 12 && age < 20;
    }
}
