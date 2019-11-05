package Day241022;

public class Figure {

    public static void main(String[] args) {
        Point a = new Point(12,12);
        Point b = new Point(7,7);
        AbstarctFigure r = new Rectangle(a,b);
        int a1 = r.getAreaOfFigure();
        System.out.println(a1);

        AbstarctFigure c = new Circle(a,5);
        int a2=c.getAreaOfFigure();
        System.out.println(a2);


    }
}
