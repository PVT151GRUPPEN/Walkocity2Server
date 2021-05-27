package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity
public class UserAccomplishment { //detta ska då kopplas ihop med det som ska displayas: bilder och vissa vilka badges som är aktiva eller ej
    private static final Integer TRASH_STATION = 100;
    private static final Integer TOILET_STATION = 100;
    private static final Integer CAFE_STATION = 100;
    private static final String TRASH_STATION_TYPE = "trash";
    private static final String TOILET_STATION_TYPE = "Toalett";
    private static final String CAFE_STATION_TYPE = " cafe";


    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    private Integer id; //kanske egentligen kan ha foreign key och hänvisa till userId
    private int level;

    public void setPoints(int points) {
        this.points = points;
    }

    private int points; //hur gör vi med stationer och dess poäng, blir isf en litenliten klass
    //private List<Badge> badges = new ArrayList<>(); //ska man ha separate listor för kategorierna
    private int toiletCount = 0; //
    private int cafeCount = 0; //
    private int trashCount = 0;
    private int stationCount = 0;

    public UserAccomplishment() {
        this.level = 1;
        this.points = 0;
    }



    public void addPoints(String stationType) { //ska användas av stationer och badges
        int addPoints = 0;
        switch (stationType.toLowerCase()) {
            case TRASH_STATION_TYPE:
                addPoints = TRASH_STATION;
                trashCount++;
                break;
            case TOILET_STATION_TYPE:
                addPoints = TOILET_STATION;
                toiletCount++;
                break;
            case CAFE_STATION_TYPE:
                addPoints = CAFE_STATION;
                cafeCount++;
                break;
        }
        stationCount++;
        this.points += addPoints;
        checkUserLevel();
    }



    public void addStation(StationLogEntry stationLogEntry) {

    }

/*    public void checkToiletLevel() {  //delar ut badges när ett visst antal nås
        if (toiletCount == 1) {
            Badge b = new Badge(StationCategory.TOILET, Badge.Level.BRONZE);
          //  badges.add(b);
            addPoints(b.getPoints());
        }
        if (toiletCount == 5) {
            Badge b = new Badge(StationCategory.TOILET, Badge.Level.SILVER);
          //  badges.add(b);
            addPoints(b.getPoints());
        }
        if (toiletCount == 10) {
            Badge b = new Badge(StationCategory.TOILET, Badge.Level.GOLD);
          //  badges.add(b);
            addPoints(b.getPoints());
        }
        if (toiletCount == 50) {
            Badge b = new Badge(StationCategory.TOILET, Badge.Level.DIAMOND);
         //   badges.add(b);
            addPoints(b.getPoints());
        }
        if (toiletCount == 100) {
            Badge b = new Badge(StationCategory.TOILET, Badge.Level.RUBY);
          //  badges.add(b);
            addPoints(b.getPoints());
        }
    }*/

/*    public void checkTrashLevel() {
        if (trashCount == 1) {
            Badge b = new Badge(StationCategory.TRASHCAN, Badge.Level.BRONZE);
          //  badges.add(b);
            addPoints(b.getPoints());
        }
        if (trashCount == 5) {
            Badge b = new Badge(StationCategory.TRASHCAN, Badge.Level.SILVER);
            badges.add(b);
            addPoints(b.getPoints());
        }
        if (trashCount == 10) {
            Badge b = new Badge(StationCategory.TRASHCAN, Badge.Level.GOLD);
            badges.add(b);
            addPoints(b.getPoints());
        }
        if (trashCount == 50) {
            Badge b = new Badge(StationCategory.TRASHCAN, Badge.Level.DIAMOND);
            badges.add(b);
            addPoints(b.getPoints());
        }
        if (trashCount == 100) {
            Badge b = new Badge(StationCategory.TRASHCAN, Badge.Level.RUBY);
            badges.add(b);
            addPoints(b.getPoints());
        }
    }

    public void checkStationLevel() {
        if (stationCount == 100) {
            Badge b = new Badge(Badge.Level.BRONZE);
            badges.add(b);
            addPoints(b.getPoints());
        }
        if (stationCount == 500) {
            Badge b = new Badge(Badge.Level.SILVER);
            badges.add(b);
            addPoints(b.getPoints());
        }
        if (stationCount == 1000) {
            Badge b = new Badge(Badge.Level.GOLD);
            badges.add(b);
            addPoints(b.getPoints());
        }
        if (stationCount == 5000) {
            Badge b = new Badge(Badge.Level.DIAMOND);
            badges.add(b);
            addPoints(b.getPoints());
        }
        if (stationCount == 10000) {
            Badge b = new Badge(Badge.Level.RUBY);
            badges.add(b);
            addPoints(b.getPoints());
        }
    }*/

    public Integer checkUserLevel() { // behöver ingen level 1 eftersom det är default
        if(points == 2000)
            level = 1;
        if(points == 2000)
            level = 2;
        if(points == 3000)
            level = 3;
        if(points == 4000)
            level = 4;
        if(points == 5000)
            level = 5;
        if(points == 6000)
            level = 6;
        if(points == 7000)
            level = 7;
        if(points == 8000)
            level = 8;
        if(points == 9000)
            level = 9;
        if(points == 10000)
            level = 10;
        if(points == 10000)
            level = 11;
        if(points == 20000)
            level = 12;
        if(points == 30000)
            level = 13;
        if(points == 40000)
            level = 14;
        if(points == 50000)
            level = 15;

        return level;
    }

    public int getToiletCount() {
        return toiletCount;
    }

    public int getTrashCount() {
        return trashCount;
    }

    public int getStationCount() {
        return stationCount;
    }



    public int getLevel() {
        return level;
    }



/*
    public List<Badge> getBadges() {
        return badges;
    }
*/




    public Integer getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }


    public int getCafeCount() {
        return cafeCount;
    }

    public void setCafeCount(int cafeCount) {
        this.cafeCount = cafeCount;
    }
}
