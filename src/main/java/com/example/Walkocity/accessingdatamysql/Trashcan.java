package com.example.Walkocity.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trashcan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private double longitude;

    private double latitude;

    private int liter;

    public Integer getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getLiter() {
        return liter;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

}