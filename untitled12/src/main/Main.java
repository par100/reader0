package main;

import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Reader reader = new Reader();
        Collection<User> collection = reader.getCollection();
        System.out.println(collection);
        collection.stream().sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (o1.getAge() - o2.getAge());
            }
        }.reversed())
                .forEach(System.out::println);
    }
}