package com.example.Walkocity.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public interface FriendListRepository extends CrudRepository<UserAccount, Integer> {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id; //kanske egentligen kan ha foreign key och hänvisa till userId

    @OneToMany
    private List<UserAccount> friends = new ArrayList<>();


    public FriendListRepository() {
    }

    public List<UserAccount> getFriends() {
        return friends;
    }

    public void addFriend(UserAccount newFriend) {
        friends.add(newFriend);
    }

    public void removeFriend(UserAccount user) { //might want to check if user exists as friend
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
