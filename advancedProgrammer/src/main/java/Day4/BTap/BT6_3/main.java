package Day4.BTap.BT6_3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Movable> movables = new ArrayList<>();

        MovablePoint movablePoint = new MovablePoint(4,5,2,3);
        movables.add(movablePoint);

        for (Movable m : movables){
            System.out.println(m);
        }
    }
}
