package ExMovableLAST;

public class Circle implements Movable{
    private int radius;
    private MovablePoint center;

    public Circle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }
    public Circle(int radius, int x, int y, int speedX, int speedY) {
        this.radius = radius;
        this.center = new MovablePoint(x,y,speedX,speedY);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        this.center.y++;
    }

    @Override
    public void moveDown() {
        this.center.y--;
    }

    @Override
    public void moveRight() {
        this.center.x++;
    }

    @Override
    public void moveLeft() {
        this.center.x--;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }
}
