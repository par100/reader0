package com.company;

@FunctionalInterface
public interface ShapeService {
    double perimeter(double a, double b);
}

//class RectangleService implements ShapeService {
//    @Override
//    public double perimeter(double a, double b) {
//        return 2 * (a + b);
//    }
//}

class Main3 {
    public static void main(String[] args) {
        ShapeService rectangleService = (a, b) -> 2 * (a + b);
        System.out.println(rectangleService.perimeter(1,2));
    }
}
