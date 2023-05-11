package Day4.BTap.BT6_3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0,1,2,3);
        movablePoint.moveUp();
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
