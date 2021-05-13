package com.example.Walkocity.accessingdatamysql;

import javax.persistence.Entity;

@Entity
public class Badge {
    private int points = 0;
    private boolean achieved = false;
    private Category category;
    private Level level;

    enum Category {
        TOILET, TRASHCAN
    }
    enum Level {
        BRONZE, SILVER, GOLD, RUBY, DIAMOND
    }
    public Badge (int points, Category category, Level level) {
        this.points = points;
        this.category = category;
        this.level = level;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getPoints() {
        return points;
    }
    public Category getCategory() {
        return category;
    }

    public Level getLevel() {
        return level;
    }

    public void setAchieved() {
        this.achieved = true;
    }
}