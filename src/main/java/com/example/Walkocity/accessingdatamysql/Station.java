package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity
public class Station {
    @Id //ska vara unik
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id; //eller longitud latitud för att vara korrekt
    private Double longitude;
    private Double latitude;
    private StationCategory category;
    private int points = 100;
    //private boolean collected;

    public Station() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setCategory(StationCategory category) {
        this.category = category;
    }

    public StationCategory getCategory() {
        return category;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
