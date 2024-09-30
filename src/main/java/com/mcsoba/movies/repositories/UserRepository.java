package com.mcsoba.movies.repositories;

import com.mcsoba.movies.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
