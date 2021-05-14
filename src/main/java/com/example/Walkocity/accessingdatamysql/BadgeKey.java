package com.example.Walkocity.accessingdatamysql;

import java.io.Serializable;

public class BadgeKey implements Serializable { //varför serializable
    private StationCategory category;
    private Badge.Level level;

    public BadgeKey(StationCategory category, Badge.Level level) {
        this.category = category;
        this.level = level;
    }
}
