package com.example.Walkocity.accessingdatamysql;

import org.springframework.lang.Nullable;
import javax.persistence.*;

@Entity @IdClass(WalkEventKey.class)
public class WalkEvent { //fundera över hur vilken klass vi ska lagra alla allmänna walks
    private String eventName;

    @OneToOne
    @Id @Column(updatable = false)
    private User owner; //Ersätts av User-instans eller liknande
    private String location;
    @Id @Column(updatable = false)
    private String date;
    @Id @Column(updatable = false)
    private String time;
    private int slots;
    private String gender;
    private String language;
    private int takenSlots;

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public User getOwner() {
        return owner;
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

    public void setSlots(int slots) {
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

    public void setTakenSlots(int takenSlots) {
        this.takenSlots = takenSlots;
    }

    public void increaseTakenSlots() {
        takenSlots++;
    }

    public void decreaseTakenSlots() {
        takenSlots--;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof WalkEvent))
            return false;
        WalkEvent other = (WalkEvent) obj;
        return (eventName.compareToIgnoreCase(other.getEventName()) == 0 &&
                owner.getFirstName().compareToIgnoreCase(other.getOwner().getFirstName()) == 0 &&
                owner.getLastName().compareToIgnoreCase(other.getOwner().getLastName()) == 0 &&
                location.compareToIgnoreCase(other.getLocation()) == 0 &&
                date.compareToIgnoreCase(other.getDate()) == 0 &&
                time.compareToIgnoreCase(other.getTime()) == 0);
    }
}
