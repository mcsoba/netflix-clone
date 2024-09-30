package com.mcsoba.movies.exceptions;

public class SpringNetflixException extends RuntimeException {
    public SpringNetflixException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringNetflixException(String exMessage) {
        super(exMessage);
    }
}