package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        var totalArea = area + balconyArea;
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    public int compareTo(Cottage cottage) {
        if (area > cottage.getArea()) {
            return 1;
        } else if (area < cottage.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
