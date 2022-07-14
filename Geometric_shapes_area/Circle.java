package Geometric_shapes_area;

public class Circle implements Shape {
    private double radius;
    static final double π = Math.PI;


    public Circle(double radius) {
        // super(radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        double circleArea = π * radius * radius;
        System.out.println("Area of the CIRCLE is: " + circleArea);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
