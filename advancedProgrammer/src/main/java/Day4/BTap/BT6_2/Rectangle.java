package Day4.BTap.BT6_2;

public class Rectangle implements GeometricObject{

    private double width;

    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                ']';
    }
}
