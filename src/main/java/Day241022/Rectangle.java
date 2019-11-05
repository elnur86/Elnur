package Day241022;

public class Rectangle extends AbstarctFigure {
    private Point a;
    private Point b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getAreaOfFigure() {
        int side1=a.getX()-b.getX();
        int side2=a.getY()-b.getY();
        return side1*side2;
    }
}
