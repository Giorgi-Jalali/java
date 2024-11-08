public class PlayingCat {
    // write code here

    public static boolean isCatPlaying (boolean summer, int temperature) {

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;
    }
}
