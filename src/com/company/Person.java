package com.company;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public abstract class Person {

    // Atributes
    private String Name;
    private LocalDate dateBirth;
    private String nationality;

    // Constructor
    public Person(String name, LocalDate dateBirth, String nationality) {
        Name = name;
        this.dateBirth = dateBirth;
        this.nationality = nationality;
    }

    // Getters
    public String getName() {
        return Name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public String getNationality() {
        return nationality;
    }

    // Setters
    public void setName(String name) {
        Name = name;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", dateBirth=" + dateBirth +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}