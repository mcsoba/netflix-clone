package com.mcsoba.movies.repositories;

import com.mcsoba.movies.entities.VerificationToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VerificationTokenRepository extends MongoRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);
}
