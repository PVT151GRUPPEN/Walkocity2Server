package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class UserAccount {
    @Id //ska vara unik@Entity // This tells Hibernate to make a table out of this class

    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String email;

    private String password;

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

    public String getPassword() { //security check
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}