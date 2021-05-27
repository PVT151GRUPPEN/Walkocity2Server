package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity
public class Station {
    @Id //ska vara unik
    private Integer id; //eller longitud latitud för att vara korrekt
    private Long timestamp;
    private Integer userId;

    public Station() {

    }

    public Station(Integer id, Long timestamp, Integer userId) {
        this.id = id;
        this.timestamp = timestamp;
        this.userId = userId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}
