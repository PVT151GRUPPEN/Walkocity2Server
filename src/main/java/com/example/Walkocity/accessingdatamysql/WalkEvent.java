package com.example.Walkocity.accessingdatamysql;

import org.springframework.lang.Nullable;
import javax.persistence.*;

@Entity @IdClass(WalkEventKey.class)
public class WalkEvent { //fundera över hur vilken klass vi ska lagra alla allmänna walks
    private String eventName;

    @OneToOne
    @Id @Column(updatable = false)
    private UserAccount owner; //Ersätts av User-instans eller liknande
    private String location;
    @Id @Column(updatable = false)
    private String date;
    @Id @Column(updatable = false)
    private String time;
    private int slots;
    private String gender;
    private String language;
    private int takenSlots;

    public WalkEvent(String eventName, UserAccount owner, String location, String date, String time, String slots, String gender, String language) {
        this.eventName = eventName;
        this.owner = owner;
        this.location = location;
        this.date = date;
        this.time = time;
        if (slots.equals("unlimited")) {
            this.slots = Integer.MAX_VALUE;
        } else {
            this.slots = Integer.parseInt(slots);
        }
        this.gender = gender;
        this.language = language;
        this.takenSlots = 0;
    }

    public WalkEvent() {

    }

    public String getEventName() {
        return eventName;
    }

    public UserAccount getOwner() {
        return owner;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
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

    public String getGender() {
        return gender;
    }

    public String getLanguage() {
        return language;
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
                location.compareToIgnoreCase(other.getLocation()) == 0 &&
                date.compareToIgnoreCase(other.getDate()) == 0 &&
                time.compareToIgnoreCase(other.getTime()) == 0);
    }
}
