public class Overloading {
    public static double convertToCentimeters(int entireHeightInches) {
        return entireHeightInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int feet = heightInFeet * 12;
        int totalFeet = feet + heightInInches;
        double result = convertToCentimeters(feet);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }
}









