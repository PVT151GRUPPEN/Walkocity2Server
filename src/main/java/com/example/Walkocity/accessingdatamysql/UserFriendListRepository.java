package com.example.Walkocity.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserFriendListRepository extends CrudRepository<UserFriendList, Integer> {

}
