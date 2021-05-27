package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity
public class StationLogEntry {
    @Id //ska vara unik
    private String id; //eller longitud latitud för att vara korrekt
    private Long timestamp;
    private Integer userId;

    public StationLogEntry() {

    }

    public StationLogEntry(String id, Long timestamp, Integer userId) {
        this.id = id;
        this.timestamp = timestamp;
        this.userId = userId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
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
