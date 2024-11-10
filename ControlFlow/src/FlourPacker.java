public class FlourPacker {
    // write code here

    public static void main(String[] args) {
        System.out.println(canPack(10, 0, 9));
        System.out.println(canPack(2, 2, 9));
        System.out.println(canPack(2, 1, 7));
        System.out.println(canPack(0, 6, 4));
    }

    private static final int BIG_WEIGHT = 5;

//    public static boolean canPack (int bigCount, int smallCount, int goal) {
//        if (bigCount * 5 + smallCount < goal || bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//
//        int BIG_WEIGHT = 5;
//
//        int remainingWeight = goal % BIG_WEIGHT;
//        return remainingWeight <= smallCount;
//
//    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;

        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}





