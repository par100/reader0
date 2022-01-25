package com.company.FunctionalInterface;

import com.company.ShapeService;

public class ActionType {
    private double x;
    private double y;

    public ActionType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double action(ShapeService2 service) {
        return 10 * service.perimeter(x,y);
    }
}

class Main4 {
    public static void main(String[] args) {
        double result = new ActionType(3, 5).action((a, b) -> (a + b) * 4);
        System.out.println(result);
    }
}

@FunctionalInterface
interface ShapeService2 {
    double perimeter(double a, double b);
}