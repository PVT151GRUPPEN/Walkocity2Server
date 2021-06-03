package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity @IdClass(JoinedWalk.class)
public class JoinedWalk implements Serializable {
    @Id
    private Integer userId; //kanske egentligen kan ha foreign key och hänvisa till userId
    @Id
    private Integer ownerId; //Ersätts av User-instans eller liknande
    @Id
    private String date;
    @Id
    private String time;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
