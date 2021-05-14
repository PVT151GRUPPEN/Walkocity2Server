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

    /*enum Category {
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
    }*/

    enum Level {
        BRONZE(1), SILVER(2), GOLD(3), RUBY(4), DIAMOND(5);
        private final int levelNo;

        Level(int levelNo) {
            this.levelNo = levelNo;
        }

        public int getLevelNo() {
            return levelNo;
        }
    }

    public Badge() {

    }

    public Badge (Category category, Level level) {
        this.category = category;
        this.level = level;

        if (level.getLevelNo() == 1) //trying numbers instead of levelName so SQL is happy
            points = 100;
        if (level.getLevelNo()  == 2)
            points = 500;
        if (level.getLevelNo()  == 3)
            points = 1000;
        if (level.getLevelNo()  == 4)
            points = 5000;
        if (level.getLevelNo()  == 5)
            points = 10000;
    }

    private void setCategory(Category category) {
        this.category = category;
    }

    private void setLevel(Level level) {
        this.level = level;
    }

    public void setAchieved() {
        this.achieved = true;
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

    public boolean isAchieved() {
        return achieved;
    }
}
