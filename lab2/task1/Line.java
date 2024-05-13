package task1;

public class Line {
    private double k;
    private double b;

    public Line (double k, double b){
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other){
        if (this.k == other.k) {
            // Lines are parallel or coincident
            if (this.b == other.b) {
                // Lines are coincident
                return null;
            } else {
                // Lines are parallel, no intersection
                return null;
            }
        } else {
            // Lines intersect, calculate intersection point
            double x = (other.b - this.b) / (this.k - other.k);
            double y = this.k * x + this.b;
            return new Point(x, y);
        }
    }
}
