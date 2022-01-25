package com.company;

public interface Service {
    default void anOperation() {
        System.out.println("Service anOperation");
        this.method();
    }

    private void method() {
        System.out.println("private method");
    }

    static void action() {
        System.out.println("Service static action");
    }

    int define(int x1, int y1);
    void load();
}

class ServiceImpl implements Service {
    @Override
    public int define(int x, int y) {
        return x + y;
    }

    @Override
    public void load() {
        System.out.println("load()");
    }
}

class Main1 {
    public static void main(String[] args) {
        Service.action();
        ServiceImpl service = new ServiceImpl();
        service.define(1,2);
        service.load();
        service.anOperation();
    }
}
