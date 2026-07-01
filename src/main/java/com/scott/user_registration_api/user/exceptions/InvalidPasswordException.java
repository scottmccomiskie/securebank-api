package com.scott.user_registration_api.user.exceptions;

public class InvalidPasswordException extends RuntimeException{


    public InvalidPasswordException(String message){
        super(message);
    }
}
