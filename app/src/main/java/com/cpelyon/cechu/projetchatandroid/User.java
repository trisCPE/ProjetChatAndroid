package com.cpelyon.cechu.projetchatandroid;

public class User {

    private String uid;
    private String username;
    private String email;
    //private String urlPicture;

    public User() { }

    public User(String uid, String username, String email) {
        this.uid = uid;
        this.username = username;
        this.email =email ;
    }

    public String getUid() { return uid; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }

    public void setUsername(String username) { this.username = username; }
    public void setUid(String uid) { this.uid = uid; }
    public void setEmail(String setEmail) { email = setEmail; }
}