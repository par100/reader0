package com.company.FunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicateStr1 = s -> s.length() < 2;
        Predicate<String> predicateStr2 = String::isBlank;
        Predicate<Integer> predicateInt = i -> i >= 9;
        System.out.println(predicateStr1.test("java"));
        System.out.println(predicateStr2.test("  "));
        System.out.println(predicateInt.test(16));
        int[] arrayInt = {12, 43, 23, 65, 54};
//        System.out.println(Arrays.stream(arrayInt)
//                        .boxed()
//                .filter(((Predicate<Integer>)(i -> i > 32)).and(i -> i < 64)).fo
//                .boxed()
//                .collect(Collectors.toList()));
        String[] arrayStr = {"Abba", "fdf", "    "};
        System.out.println(Arrays.stream(arrayStr)
                .filter((Predicate<String>)(str -> str.isBlank()))
                .collect(Collectors.toList()));
        Function<String, Integer> fun1 = s -> s.length();
        Function<Integer, String> fun2 = i -> Integer.toBinaryString(i);
        System.out.println(fun1.apply("Rimma"));
        System.out.println(fun2.apply(8));
        System.out.println(Arrays.stream(arrayStr)
                .map(s -> s.length())
                .collect(Collectors.toList()));
        Function<Integer, Integer> fun3 = fun1.compose(fun2);
    }
}
