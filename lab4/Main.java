public class Main {
    public static void main(String[] args) {
        // Create some Point objects
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(0, 1);
        Point p4 = new Point(1, 1);

        // Create a Triangle
        Triangle triangle = new Triangle(p1, p2, p3);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.area());
        System.out.println("Centroid: " + triangle.centroid());

        // Create a Quadrilateral
        Quadrilateral quadrilateral = new Quadrilateral(p1, p2, p3, p4);
        System.out.println(quadrilateral);
        System.out.println("Area: " + quadrilateral.area());
        System.out.println("Centroid: " + quadrilateral.centroid());

        // Create a Circle
        Circle circle = new Circle(p1, 5.0);
        System.out.println(circle);
        System.out.println("Area: " + circle.area());
        System.out.println("Centroid: " + circle.centroid());

        // Ensure the application demonstrates functionality effectively
    }
}
