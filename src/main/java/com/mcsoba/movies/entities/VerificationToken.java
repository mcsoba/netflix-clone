package com.mcsoba.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "token")  // Collection name in MongoDB
public class VerificationToken {

    @Id
    private String id;  // MongoDB ObjectId will be automatically generated

    private String token;

    @DBRef(lazy = true)  // Reference to User document, with lazy loading
    private User user;

    private Instant expiryDate;
}

