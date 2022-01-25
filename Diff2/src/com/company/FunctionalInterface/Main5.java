package com.company.FunctionalInterface;

public class Main5 {
    public static void main(String[] args) {
//        Dosmth dosmth = (x, y) -> {
//            return x * y;
//        };
        int result = new Smth(2,3).foo((x,y) -> x * y);
        System.out.println(result);
    }
}

class Smth {
    int x;
    int y;

    public Smth(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int foo(Dosmth dosmth) {
        return 100 * dosmth.doIt(x, y);
    }
}

@FunctionalInterface
interface Dosmth {
    public int doIt(int x, int y);
}