package com.example.Walkocity.accessingdatamysql;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserFriendList {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id; //kanske egentligen kan ha foreign key och hänvisa till userId

    @OneToMany
    private List<User> friends = new ArrayList<>();


    public UserFriendList() {
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User newFriend) {
        friends.add(newFriend);
    }

    public void removeFriend(User user) { //might want to check if user exists as friend
        friends.remove(user);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
}
