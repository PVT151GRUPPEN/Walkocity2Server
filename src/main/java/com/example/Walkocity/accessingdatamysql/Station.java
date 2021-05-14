package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity
public class Station {
    @Id //ska vara unik
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id; //eller longitud latitud för att vara korrekt
    private Category category; //what association
    private int points;
    //private boolean collected;

    public Station() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
