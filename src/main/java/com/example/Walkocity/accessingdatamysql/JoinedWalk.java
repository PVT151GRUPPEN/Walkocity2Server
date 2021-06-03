package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;


@Entity
public class JoinedWalk {
    @Id
    private Integer walkEventId;
    private Integer userId; //kanske egentligen kan ha foreign key och hänvisa till userId

    public void setWalkEventId(Integer walkEventId) {
        this.walkEventId = walkEventId;
    }

    public Integer getWalkEventId() {
        return walkEventId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

}
