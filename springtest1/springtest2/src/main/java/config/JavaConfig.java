package config;

import model.Adress;
import model.Cat;
import model.Dog;
import model.User;
import org.springframework.context.annotation.*;

@Configuration
public class JavaConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Description("Cat ha-ha")
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public User user() {
        return new User(adress());
    }

    @Bean
    public Adress adress() {
        return new Adress("Bakinskaya, 16", 124875);
    }
}
