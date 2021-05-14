package com.example.Walkocity.accessingdatamysql;

import java.io.Serializable;

public class WalkEventKey implements Serializable {
    private UserAccount owner;
    private String date;
    private String time;

    public WalkEventKey(UserAccount owner, String date, String time) {
        this.owner = owner;
        this.date = date;
        this.time = time;
    }
}
