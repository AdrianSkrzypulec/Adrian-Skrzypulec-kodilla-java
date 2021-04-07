package com.kodilla.spring.forum;

//@Component
public class ForumUser {

    String username;

    public ForumUser(String username) {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
