package exercise;

// BEGIN
public class Flat implements Home {
    private final double area;
    private final double balconyArea;
    private final int floor;

    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + floor + " этаже";
    }

    @Override
    public int compareTo(Home flat) {
        return Double.compare(this.getArea(), flat.getArea());
    }

    public double getArea() {
        return area + balconyArea;
    }

}
// END
