package com.example.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    protected User() {

    }

    private User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static User of(String name) {
        return new User(null, name);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
