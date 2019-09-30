package com.company;

import java.time.LocalDate;

public class Player extends Person {

    private Integer height;
    private Float weight;
    private String position;

    public Player(String name, LocalDate dateBirth, String nationality, Integer height, Float weight, String position) {
        super(name, dateBirth, nationality);
        this.height = height;
        this.weight = weight;
        this.position = position;
    }

    @Override
    public String toString() {

        String person = super.toString();
        return "Player{" +
                "height=" + height +
                ", weight=" + weight +
                ", position=" + position +
                '}';
    }
}
