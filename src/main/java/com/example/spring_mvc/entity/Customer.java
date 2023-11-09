package com.example.spring_mvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer age;
    private String name;
    private String address;

    public Customer(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address= address;
    }

    public Customer() {

    }
}
