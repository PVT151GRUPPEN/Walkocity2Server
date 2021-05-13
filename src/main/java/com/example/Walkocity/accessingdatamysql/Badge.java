package com.example.Walkocity.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity @IdClass(BadgeKey.class)
public class Badge {
    private int points = 0;
    private boolean achieved = false;
    @Id @Column(updatable = false)
    private Category category;
    @Id @Column(updatable = false)
    private Level level;

    enum Category {
        TOILET("Toilet"), TRASHCAN("Trashcan");
        private final String categoryName;

        private Category(String categoryName) {
            this.categoryName = categoryName;
        }
        public String getCategoryName() {
            return categoryName;
        }
    }
    enum Level {
        BRONZE("Bronze"), SILVER("Silver"), GOLD("Gold"), RUBY("Ruby"), DIAMOND("Diamond");
        private final String levelName;


        Level(String levelName) {
            this.levelName = levelName;
        }

        public String getLevelName() {
            return levelName;
        }
    }

    public Badge() {

    }

    public Badge (int points, Category category, Level level) {
        this.points = points;
        this.category = category;
        this.level = level;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    private void setCategory(Category category) {
        this.category = category;
    }

    private void setLevel(Level level) {
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
