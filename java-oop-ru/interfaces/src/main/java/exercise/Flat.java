package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public String toString() {
        var totalArea = area + balconyArea;
        return "Квартира площадью " + totalArea + " метров на " + floor + " этаже";
    }

    public int compareTo(Flat flat) {
        if (area > flat.getArea()) {
            return 1;
        } else if (area < flat.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public double getArea() {
        return area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }
}
// END
