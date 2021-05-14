package com.example.Walkocity.accessingdatamysql;

import java.io.Serializable;

public class WalkEventKey implements Serializable {
    private User owner;
    private String date;
    private String time;

    public WalkEventKey(User owner, String date, String time) {
        this.owner = owner;
        this.date = date;
        this.time = time;
    }
}
