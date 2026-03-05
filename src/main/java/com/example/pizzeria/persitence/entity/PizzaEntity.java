package com.example.pizzeria.persitence.entity;

import jakarta.persistence.*;

@Entity
@Table(name="pizza")
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @Column(nullable = false, length = 30, unique = true)
    private String name;
}
