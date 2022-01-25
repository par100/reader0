package model;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private Adress adress;

    public User(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }
}
