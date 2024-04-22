package exercise;

// BEGIN
public class Cottage implements Home {
    private final double area;
    private final int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    @Override
    public int compareTo(Home cottage) {
        return Double.compare(area, cottage.getArea());
    }

    public double getArea() {
        return area;
    }
}
// END
