public class BarkingDog {
    // write code here

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
