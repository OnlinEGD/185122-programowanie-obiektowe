public class Point {
    double x;
    double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint)
    {
        return(Math.abs(Math.sqrt(Math.pow(otherPoint.x-x,2)+Math.pow(otherPoint.y-y,2))));
    }
}
