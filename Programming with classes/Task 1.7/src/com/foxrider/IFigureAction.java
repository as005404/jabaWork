package com.foxrider;

public interface IFigureAction<T extends Figure> {
    double perimeter(T fig);
    double area(T fig);
}
