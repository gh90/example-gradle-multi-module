package com.gh90.example.domain.product;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String price;

    public Product(){}
    public Product(String name, String price){
        this.name = name;
        this.price = price;
    }
}
