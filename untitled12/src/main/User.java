package main;

public class User {
    private String name;
    private String surname;
    private int age;
    private String passport;

    public User(String name, String surname, int age, String passport) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }
}
