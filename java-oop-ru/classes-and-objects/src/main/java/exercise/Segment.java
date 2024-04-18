package exercise;

// BEGIN
public class Segment {
    private final Point beginPoint;
    private final Point endPoint;

    Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        var midX = Math.abs(beginPoint.getX() - endPoint.getX()) + beginPoint.getX();
        var midY = Math.abs(beginPoint.getY() - endPoint.getY()) + beginPoint.getY();
        return new Point(midX, midY);
    }
}
// END
