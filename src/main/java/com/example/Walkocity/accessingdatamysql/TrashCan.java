package com.example.Walkocity.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrashCan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


    private Double longitude;

    private Double latitude;

    private Double liter;

    public Integer getId() {
        return id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLiter() {
        return liter;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setLiter(Double liter) {
        this.liter = liter;
    }

}