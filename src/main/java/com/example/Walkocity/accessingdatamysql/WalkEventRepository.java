package com.example.Walkocity.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface WalkEventRepository extends CrudRepository<WalkEvent, WalkEventKey> {
}
