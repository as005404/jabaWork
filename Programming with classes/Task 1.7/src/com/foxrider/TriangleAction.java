package com.foxrider;

public class TriangleAction implements IFigureAction<Triangle> {
    double getLineA(Triangle t){
        return t.getA().line(t.getB());
    }
    double getLineB(Triangle t){
        return t.getB().line(t.getC());
    }
    double getLineC(Triangle t){
        return t.getC().line(t.getA());
    }

    @Override
    public double perimeter(Triangle fig) {
        double lineA = getLineA(fig);
        double lineB = getLineB(fig);
        double lineC = getLineC(fig);

        return lineA+lineB+lineC;
    }

    @Override
    public double area(Triangle fig) {
        double lineA = getLineA(fig);
        double lineB = getLineB(fig);
        double lineC = getLineC(fig);

        double p = perimeter(fig)/2.0;
        return Math.sqrt(p*(p-lineA)*(p-lineB)*(p-lineC));
    }

    public Point medianCoord(Triangle fig){
        Point a = fig.getA();
        Point b = fig.getB();
        Point c = fig.getC();
        double xCoord = (a.getX()+b.getX()+c.getX())/3;
        double yCoord = (a.getY()+b.getY()+c.getY())/3;

        return new Point(xCoord,yCoord);
    }
}
