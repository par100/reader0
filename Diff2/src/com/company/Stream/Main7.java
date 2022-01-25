package com.company.Stream;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {
//        OrderType type1 = new OrderType(771);
//        type1.add("SEK");
//        type1.add("DKK");
//        type1.add("NOK");
//        type1.add("EUR");
//        OrderType type2 = new OrderType(779);
//        type2.add("SEK");
//        type2.add("PLN");
//        type2.add("CZK");
//        type2.add("EUR");
//        List<OrderType> orderTypes = List.of(type1, type2);
//        Stream<OrderType> stream = orderTypes.stream();
//        Stream<List<String>> listStream = orderTypes.stream()
//                .map(o -> o.getCurrencyNames());
//        Stream<String> stringStream = orderTypes.stream()
//                .map(o -> o.getCurrencyNames())
//                .flatMap(o -> o.stream());
//        List<String> currencyList = orderTypes.stream()
//                .map(o -> o.getCurrencyNames())
//                .flatMap(o -> o.stream())
//                .collect(Collectors.toList());
//        System.out.println(currencyList);
//
//        int[] ints = new int[10];
//        ints[0] = 0;
//        ints[1] = 1;
//        ints[2] = 2;
//        ints[3] = 3;
//        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
//        int[] ints1 = Arrays.stream(arr)
//                .boxed()
//                .flatMapToInt(o -> Arrays.stream(o))
//                .toArray();
//        System.out.println(Arrays.toString(ints1));
//
//        Optional<String> s = Optional.of("Test");
//        System.out.println(Optional.of("TEST").equals(s.map(String::toUpperCase)));
//        System.out.println(Optional.of(Optional.of("STRING"))
//                .equals(
//                        Optional.of("string")
//                                .map(o -> Optional.of("STRING"))));
//        System.out.println(Optional.of("string")
//                .map(o -> Optional.of("STRING")));
//        System.out.println(Optional.of("string")
//                .flatMap(o -> Optional.of("STRING")));
//        List<List<String>> list = List.of(
//                Arrays.asList("a"),
//                Arrays.asList("b")
//        );
//        System.out.println(list);
//
//        Stream<List<String>> stream = list.stream();
//        System.out.println(list.stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList()));
        String[] strings = new String[5];
        strings[0] = "s1";
        strings[1] = "java";
        strings[2] = "Kazahstan";
        strings[3] = "Rimma";
        strings[4] = "Bosaia";
//        List<String> collect = Arrays.stream(strings).collect(Collectors.toList());
//        System.out.println(collect);
//        Arrays.stream(strings)
//                .filter(Objects::nonNull)
//                collect.stream()
//                .map(String::length)
//                .peek(str -> System.out.print(str + "-"))
//                .map(n -> n + 100)
//                .forEach(str -> System.out.println(str + " "));
//        Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .collect(Collectors.toList());
//
//        Stream<User> userStream = Stream.of(new User("Alice"), new User("Bob"), new User("Chuck"));
//        userStream.peek(u -> u.setName(u.getName().toLowerCase()))
//                .forEach(System.out::println);
//        Arrays.stream(strings)
//                .filter(Objects::nonNull)
//                .sorted((s1, s2) -> s1.length() - s2.length())
//                .peek(o-> System.out.println("peek " + o))
//                .forEach(System.out::println);
//
//        userStream.map(u -> {
//                    u.setName(u.getName().toLowerCase());
//                    return u;
//                })
//                .forEach(System.out::println);

//                .forEach(System.out::println);
//        System.out.println(List.of(strings));
//        List.of(strings).stream()
//                .map(String::length)
//                .peek(str -> System.out.print(str + "-"))
//                .map(n -> n + 100)
//                .forEach(str -> System.out.println(str + " "));
//        System.out.println(s.map(String::toUpperCase));
//        assertEquals(Optional.of("Test"), s.map(String::toUpperCase));

        Optional<String> reduce = Arrays.stream(strings)
//                .map(s -> s.length())
                .reduce((s1, s2) -> s1.concat(s2));
        System.out.println(reduce.get());

        int sumLength = Arrays.stream(strings)
                .map(s -> s.length())
                .reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sumLength);

        int sum = Arrays.stream(strings)
                .reduce(0, (identity, v) -> v.length() + identity, Integer::sum);
        System.out.println(sum);
        Integer [][] [][] mass = {{{{1,2,3}}}, {{{1,2,3}}}};
        Stream<Integer[][]> stream1 = Stream.of(mass).flatMap(Arrays::stream);
        List<Integer[][]> collect = stream1.collect(Collectors.toList());
        StringBuilder i = new StringBuilder("привет");
        List<StringBuilder> integerList = new ArrayList<>();
        integerList.add(i);
        i = i.append("пока");
        System.out.println("интеджер лист" + integerList);
        Integer t = 300;
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(t);
        t = t + 300;
        System.out.println("интеджер лист" + integerList2);
//        Comparable
    }
//    Stream.of(mass).flatMap(Arrays::stream).collect(Collectors.toList());
}

class User {
    String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class OrderType {
    private int orderId;
    private List<String> currencyNames = new ArrayList<>();

    public OrderType(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getCurrencyNames() {
        return List.copyOf(currencyNames);
    }

    public boolean add(String e) {
        return currencyNames.add(e);
    }

}