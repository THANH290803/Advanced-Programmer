package Day4.BTap.BT6_2;

public class Circle implements GeometricObject{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                ']';
    }
}
