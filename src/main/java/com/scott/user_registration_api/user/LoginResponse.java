package com.scott.user_registration_api.user;

public class LoginResponse {

    private Long id;
    private String username;
    private String email;
    private String message;

    public LoginResponse(){
        // empty contructor for bean
    }

    public LoginResponse(Long id, String username, String email, String message){
        this.id = id;
        this.username = username;
        this.email = email;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
