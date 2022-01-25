package model;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public void getVoice() {
        System.out.println("Meow-meow");
    }

    public void init() {
        System.out.println("I'm instantiating a cat-bean");
    }

    public void destroy() {
        System.out.println("I'm destroying a cat-bean");
    }
}