package com.workintech.fswebs17d1.entity;

public class Animal {
    private Integer id;
    private String name;

    public Animal() {
    }

    public Animal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return null;
    }
}
