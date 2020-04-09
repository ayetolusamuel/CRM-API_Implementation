package com.codingwithset.springbootcourse.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String phone_number;
    private String city;
    private String state;
    private String country;
    private String gender;
}
