package com.example.Walkocity.accessingdatamysql;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class JoinedWalkList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id; //kanske egentligen kan ha foreign key och hänvisa till userId


    private List<WalkEvent> joinedWalks = new ArrayList<>();
}
