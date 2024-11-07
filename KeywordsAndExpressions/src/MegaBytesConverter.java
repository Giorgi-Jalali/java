public class MegaBytesConverter {
    // write code here

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int newKiloBytes = kiloBytes % 1024;
        int megaBytes = kiloBytes / 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + newKiloBytes + " KB");
    }
}
