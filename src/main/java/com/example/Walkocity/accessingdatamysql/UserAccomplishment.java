package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserAccomplishment { //detta ska då kopplas ihop med det som ska displayas: bilder och vissa vilka badges som är aktiva eller ej
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id; //kanske egentligen kan ha foreign key och hänvisa till userId
    private int level;
    private int points; //hur gör vi med stationer och dess poäng, blir isf en litenliten klass
    @OneToMany
    private List<Badge> badges = new ArrayList<>(); //ska man ha separate listor för kategorierna
    private int toiletCount = 0; //
    private int trashCount = 0;

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

    public void addPoints(int points) { //ska användas av stationer och badges
        this.points += points;
    }

    public void addBadge(Badge badge) {
        addPoints(badge.getPoints());
        badges.add(badge);
    }

    public void addStation(Station station) {
        if(station.getCategory().equals(Category.TOILET)) {
            toiletCount++;
            checkToiletLevel();
        }
        if(station.getCategory().equals(Category.TRASHCAN)) {
            trashCount++;
            checkTrashLevel();
        }
    }
    public void checkToiletLevel() {  //delar ut badges när ett visst antal nås
        if (toiletCount == 1)
            badges.add(new Badge(Category.TOILET, Badge.Level.BRONZE));
        if (toiletCount == 5)
            badges.add(new Badge(Category.TOILET, Badge.Level.SILVER));
        if (toiletCount == 10)
            badges.add(new Badge(Category.TOILET, Badge.Level.GOLD));
        if (toiletCount == 50)
            badges.add(new Badge(Category.TOILET, Badge.Level.DIAMOND));
        if (toiletCount == 100)
            badges.add(new Badge(Category.TOILET, Badge.Level.RUBY));
    }

    public void checkTrashLevel() {
        if (trashCount == 1)
            badges.add(new Badge(Category.TRASHCAN, Badge.Level.BRONZE));
        if (trashCount == 5)
            badges.add(new Badge(Category.TRASHCAN, Badge.Level.SILVER));
        if (trashCount == 10)
            badges.add(new Badge(Category.TRASHCAN, Badge.Level.GOLD));
        if (trashCount == 50)
            badges.add(new Badge(Category.TRASHCAN, Badge.Level.DIAMOND));
        if (trashCount == 100)
            badges.add(new Badge(Category.TRASHCAN, Badge.Level.RUBY));
    }
    public int getToiletCount() {
        return toiletCount;
    }

    public int getTrashCount() {
        return trashCount;
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
