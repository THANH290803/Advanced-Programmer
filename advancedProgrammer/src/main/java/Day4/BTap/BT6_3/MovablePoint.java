package Day4.BTap.BT6_3;

public class MovablePoint implements Movable{

    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y-= ySpeed;
    }

    @Override
    public void moveDown() {
       y = y+= ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x-= xSpeed;
    }

    @Override
    public void moveRight() {
       x = x+= xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")" +
                "  Speed=(" + xSpeed +
                ", " + ySpeed +
                ')';
    }
}
