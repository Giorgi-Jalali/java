public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(600));
        System.out.println(getDurationString(3600, 60));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Incorrect seconds";
        }

        int min = seconds / 60;
        int sec = seconds % 60;

        return getDurationString(sec, min);

    }

    public static String getDurationString(int seconds, int minutes) {
        if (minutes < 0 || seconds < 0) {
            return "Incorrect seconds or minutes";
        }

        int sec = seconds % 60;

        int min1 = seconds / 60 + minutes;
        int min2 = min1 % 60;
        int hour = min1 / 60;

        return (hour + "h " + min2 + "m " + sec + "s");
    }
}














