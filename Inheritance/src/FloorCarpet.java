public class FloorCarpet {
    // write code here

    private final double width;
    private final double length;

    public FloorCarpet(double width, double length) {

        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return width * length;
    }
}

//public class Carpet {
//    // write code here
//
//    private double cost;
//
//    public Carpet(double cost) {
//        if (cost < 0) {
//            this.cost = 0;
//        } else {
//            this.cost = cost;
//        }
//
//    }
//
//    public double getCost() {
//        return cost;
//    }
//}

//public class Calculator {
//    // write code here
//
//    private Floor floor;
//    private Carpet carpet;
//
//    public Calculator(Floor floor, Carpet carpet) {
//        this.floor = floor;
//        this.carpet = carpet;
//    }
//
//    public double getTotalCost() {
//        return floor.getArea() * carpet.getCost();
//    }
//}