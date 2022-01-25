package com.company.Collection;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<Order1> orders = new ArrayList<>();
        orders.add(new Order1(3));
        orders.add(new Order1(10));
        orders.add(new Order1(15));
        orders.add(new Order1(12));
        orders.add(new Order1(7));
        orders.removeIf(order -> order.sum > 10);
        orders.stream().forEach(System.out::println);
    }
}

class Order1 {
    int sum;

    public Order1(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sum=" + sum +
                '}';
    }
}
