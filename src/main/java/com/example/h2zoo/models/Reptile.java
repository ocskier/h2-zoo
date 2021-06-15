package com.example.h2zoo.models;

import javax.persistence.*;

@Entity
public class Reptile {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private final String name;
    @Column
    private final String species;
    @Column
    private final String color;
    @Column
    private final String diet;

    public Reptile(String name, String species, String color, String diet) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.diet = diet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getDiet() {
        return diet;
    }
}
