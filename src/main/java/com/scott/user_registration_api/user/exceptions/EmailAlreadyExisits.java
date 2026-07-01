package com.scott.user_registration_api.user.exceptions;

public class EmailAlreadyExisits extends RuntimeException{

    public EmailAlreadyExisits(String message){
        super(message);
    }
}
