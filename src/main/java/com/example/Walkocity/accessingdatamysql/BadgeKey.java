package com.example.Walkocity.accessingdatamysql;

import java.io.Serializable;

public class BadgeKey implements Serializable { //varför serializable
    private Category category;
    private Badge.Level level;

    public BadgeKey(Category category, Badge.Level level) {
        this.category = category;
        this.level = level;
    }
}
