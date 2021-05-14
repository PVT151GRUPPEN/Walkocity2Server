package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
public class UserAccount {
    @Id //ska vara unik
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String email;

    private char[] password;

    private LocalDate startDate;

    @OneToOne
    private UserAccomplishment accomp;

    @OneToOne
    private UserFriendList friendList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public char[] getPassword() { //security check
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}