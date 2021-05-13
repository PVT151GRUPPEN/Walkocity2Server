package com.example.Walkocity.accessingdatamysql;

import java.io.Serializable;

public class BadgeKey implements Serializable { //varför serializable
    private Badge.Category category;
    private Badge.Level level;
}
