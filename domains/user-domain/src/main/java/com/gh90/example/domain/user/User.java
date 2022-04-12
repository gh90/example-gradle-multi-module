package com.gh90.example.domain.user;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public User(){}

    public User(String name){
        this.name = name;
    }
}
