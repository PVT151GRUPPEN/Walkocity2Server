package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity @IdClass(Friendship.class)
public class Friendship implements Serializable {

    @Id
    private Integer id; //kanske egentligen kan ha foreign key och hänvisa till userId

    @Id
    private Integer friendId;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public Integer getFriendId() {
        return friendId;
    }

}
