package com.foxrider;
/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 * */
public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(4,0);
        Point p3 = new Point(0,3);
	    Figure f = new Triangle(p1,p2,p3);

	    IFigureAction<Triangle> action= new TriangleAction();

        System.out.println(action.perimeter((Triangle) f));

        System.out.println(action.area((Triangle) f));

        TriangleAction ac = new TriangleAction();
        System.out.println(ac.medianCoord((Triangle) f));
    }
}
