package Test;

import entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        String[] arr = {"a", "aaa", "aaaa"};
        Optional<Integer> first = Arrays.stream(arr).filter(str -> str.length() >= 2)
                .map(str -> str.length())
                .findFirst();
        System.out.println(first.get());

    }
}
