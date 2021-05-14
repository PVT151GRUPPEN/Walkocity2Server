package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {

    @Id //ska vara unik
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String country;

    /* Måste vara lista av Languages (klass)?
    @OneToMany
    private List<String> languages = new ArrayList<>();
*/
    @OneToOne
    private UserAccomplishment accomp;

    @OneToOne
    private UserFriendList friendList;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
/*
    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getLanguages() {
        return languages;
    }
*/
    public void setAccomp(UserAccomplishment accomp) {
        this.accomp = accomp;
    }

    public UserAccomplishment getAccomp() {
        return accomp;
    }

    public void setFriendList(UserFriendList friendList) {
        this.friendList = friendList;
    }

    public UserFriendList getFriendList() {
        return friendList;
    }
}
