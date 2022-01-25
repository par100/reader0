package nasledovanie.Test;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> pred1 = (el -> el % 2 == 0);
        Integer[] array = {1, 2, 9, 4, 5, 6};
//        Arrays.stream(array).filter(pred1)
//        .forEach(System.out::println);
//        System.out.println();
//        IntStream.of(1,2,3,4,5,6,7,8,9,10)
//                .filter(el -> el > 5)
//                .forEach(System.out::println);
//        System.out.println(Arrays.stream(array).anyMatch(el -> el % 3 == 0));
//        System.out.println(Arrays.stream(array).noneMatch(el-> el % 10 == 0));
        User1[] users = {
                new User1("Rimma", true, 100000),
                new User1("Aykhan", true, 400000),
                new User1("Vasily", false, 10000000),
                new User1("Murad", false, 1000)
        };
        System.out.println(Arrays.stream(users)
                .filter(((Predicate<User1>) (el -> el.salary > 100000))
                        .and(el -> el.passionate == true))
                .collect(Collectors.toList()));
        System.out.println(IntStream.range(1, 100)
                .filter(((IntPredicate) (el -> el < 4))
                        .or(el -> el > 32)
                        .negate()
                )
                .boxed()
                .collect(Collectors.toList())
        );
//        Predicate.isEqual();
    }
}

class User1 {
    String name;
    boolean passionate;
    int salary;

    public User1(String name, boolean passionate, int salary) {
        this.name = name;
        this.passionate = passionate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passionate=" + passionate +
                ", salary=" + salary +
                '}';
    }
}
