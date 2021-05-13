package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserAccomplishment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private int level;
    private int points;
    @OneToMany
    private List<Badge> badges = new ArrayList<>();

    public UserAccomplishment() {
        this.level = 1;
        this.points = 0;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addBadge(Badge badge) {
        badges.add(badge);
    }

    public Integer getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public int getPoints() {
        return points;
    }

    public List<Badge> getBadges() {
        return badges;
    }
}
