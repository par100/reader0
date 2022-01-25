package com.company.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class CurrentOrders {
    private WeakHashMap<Key, Order> orders = new WeakHashMap<>();

    public Order put(Key key, Order value) {
        return orders.put(key, value);
    }

    public Order get(Object key) {
        return orders.get(key);
    }

    public int size() {
        return orders.size();
    }
}

class Key {
    private int keyUnique;
    private boolean isProcessed;

    public Key(int keyUnique) {
        this.keyUnique = keyUnique;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }
}

class Order {
    private int id;
    private double price;

    public Order(int id, double price) {
        this.id = id;
        this.price = price;
    }
}

class CurrentOrdersMain {
    public static void main(String[] args) throws InterruptedException {
        CurrentOrders orders = new CurrentOrders();
        List<Key> keys = new ArrayList<>();
        keys.add(new Key(100));
        keys.add(new Key(220));
        keys.add(new Key(770));
        orders.put(keys.get(0), new Order(77, 10d));
        orders.put(keys.get(1), new Order(65, 54d));
        orders.put(keys.get(2), new Order(41, 93d));
        keys.get(1).setProcessed(true);
        final int size = keys.size();
        Iterator<Key> iterator = keys.iterator();
        while (iterator.hasNext()) {
            Key ordersKey = iterator.next();
            if (ordersKey.isProcessed()) {
                iterator.remove();
            }
        }
        System.out.println(orders.size());
        System.gc();
        Thread.sleep(1_000);
        System.out.println(orders.size());
    }
}