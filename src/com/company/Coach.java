package com.company;

import java.time.LocalDate;

public class Coach extends Person {

    private LocalDate debutDate;
    private Integer titlesAchieved;

    public Coach(String name, LocalDate dateBirth, String nationality, LocalDate debutDate, Integer titlesAchieved) {
        super(name, dateBirth, nationality);
        this.debutDate = debutDate;
        this.titlesAchieved = titlesAchieved;
    }

    public LocalDate getDebutDate() {
        return debutDate;
    }

    public Integer getTitlesAchieved() {
        return titlesAchieved;
    }

    public void setDebutDate(LocalDate debutDate) {
        this.debutDate = debutDate;
    }

    public void setTitlesAchieved(Integer titlesAchieved) {
        this.titlesAchieved = titlesAchieved;
    }

    @Override
    public String toString() {

        String coach = super.toString();
        return "Coach{" +
                "debutDate=" + debutDate +
                ", titlesAchieved=" + titlesAchieved +
                '}';
    }
}
