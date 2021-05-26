package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class JoinedWalk {
    @Id
    private Integer userId; //kanske egentligen kan ha foreign key och hänvisa till userId
    @OneToOne
    private WalkEvent walkEvent;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setWalkEvent(WalkEvent walkEvent) {
        this.walkEvent = walkEvent;
    }

    public WalkEvent getWalkEvent() {
        return walkEvent;
    }
}
