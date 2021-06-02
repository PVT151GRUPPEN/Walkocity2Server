package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity @IdClass(WalkEventKey.class)
public class WalkEvent implements Serializable { //fundera över hur vilken klass vi ska lagra alla allmänna walks
    private String eventName;

    @Id @Column(updatable = false)
    private Long walkEventId;
    @Id @Column(updatable = false)
    private Integer ownerId; //Ersätts av User-instans eller liknande
    @Id @Column(updatable = false)
    private String date;
    @Id @Column(updatable = false)
    private String time;
    private String location;
    private Integer slots;
    private String gender;
    private String language;
    private Integer takenSlots;

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public Long getWalkEventId() {
        return walkEventId;
    }

    public void setWalkEventId(Long walkEventId) {
        this.walkEventId = walkEventId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    public int getSlots() {
        return slots;
    }


    public String getParticipantsString() {
        if (slots == Integer.MAX_VALUE) {
            return "unlimited";
        }
        return  slots + " (" + takenSlots + "/" + slots + ")";
    }

    public int checkAvailability() {
        return slots - takenSlots;
    }

    public void bookSlot() {
        takenSlots++;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setTakenSlots(Integer takenSlots) {
        this.takenSlots = takenSlots;
    }

    public void increaseTakenSlots() {
        takenSlots++;
    }

    public void decreaseTakenSlots() {
        takenSlots--;
    }

}
