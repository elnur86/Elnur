package Day241022;

public class Circle extends AbstarctFigure
{
    private int radius;
    private Point center;

    public Circle(Point center, int radius)
    {
        this.center=center;
        this.radius=radius;
    }
    @Override
    public int getAreaOfFigure() {
        return radius*radius*3;
    }
}
