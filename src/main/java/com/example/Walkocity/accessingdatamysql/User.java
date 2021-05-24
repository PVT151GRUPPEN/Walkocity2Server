package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {

    @Id //ska vara unik
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String genderIdentity;
    private String genderSearch;
    private String country;
    private String photo;


    /* Måste vara lista av Languages (klass)?
    @OneToMany
    private List<String> languages = new ArrayList<>();
*/
    @OneToOne
    private UserAccomplishment accomp;

    @OneToOne
    private UserFriendList friendList;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

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

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setGenderIdentity(String gender) {
        this.genderIdentity = gender;
    }

    public String getGenderIdentity() {
        return genderIdentity;
    }

    public void setGenderSearch(String genderSearch) {
        this.genderSearch = genderSearch;
    }

    public String getGenderSearch() {
        return genderSearch;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
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
