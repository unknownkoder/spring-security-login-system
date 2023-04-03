package com.unkownkoder.models;

public class RegistrationDTO {
    private String username;
    private String password;

    public RegistrationDTO(){
        super();
    }

    public RegistrationDTO(String username, String password){
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String toString(){
        return "Registration info: username: " + this.username + " password: " + this.password;
    }
}
