package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity
public class WalkEvent { //fundera över hur vilken klass vi ska lagra alla allmänna walks
    private String eventName;

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private User ownerUser; //Ersätts av User-instans eller liknande
    private Long dateTime;
    private String location;
    private Integer slots;
    private String gender;
    private String language;
    private Integer takenSlots;
    private String latitude;
    private String longitude;



    private String description;


    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setDateTime(Long date) {
        this.dateTime = date;
    }

    public Long getDateTime() {
        return dateTime;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    public int getSlots() {
        return slots;
    }


    public Integer getTakenSlots() {
        return takenSlots;
    }

    public User getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(User ownerUser) {
        this.ownerUser = ownerUser;
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
