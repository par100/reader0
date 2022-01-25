package com.company;

public class Main2 {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.foo();
    }
}

interface Interface1 {
    default void foo() {
        System.out.println("int1");
    }
}

interface Interface2 {
    default void foo() {
        System.out.println("int2");
    }
}

class Class2 implements Interface1, Interface2 {
    @Override
    public void foo() {
        System.out.println("Z");
    }
}