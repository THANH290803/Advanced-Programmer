package Day4.BTap.BT6_2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>();
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(4,5);
        geometricObjects.add(circle);
        geometricObjects.add(rectangle);

        for (GeometricObject g : geometricObjects){
            System.out.println(g);
        }
    }
}
