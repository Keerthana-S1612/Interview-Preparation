package com.example.projectapi;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
public class EntityClass {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;


}
