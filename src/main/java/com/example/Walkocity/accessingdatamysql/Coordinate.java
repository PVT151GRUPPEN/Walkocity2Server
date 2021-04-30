package com.example.Walkocity.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coordinate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private double longitude;

    private double latitude;

    private int liter;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getLiter() {
        return liter;
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