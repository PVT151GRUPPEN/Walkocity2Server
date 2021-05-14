package com.example.Walkocity.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface BadgeRepository extends CrudRepository<Badge, BadgeKey> {
    // This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
}
