package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {

    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(1, "User001", 'M', LocalDate.of(2000, 10, 5), 1));
        listOfForumUsers.add(new ForumUser(2, "User002", 'F', LocalDate.of(1975, 10, 5), 69));
        listOfForumUsers.add(new ForumUser(2, "User003", 'M', LocalDate.of(1999, 10, 5), 2));
        listOfForumUsers.add(new ForumUser(4, "User004", 'F', LocalDate.of(2005, 10, 5), 35));
        listOfForumUsers.add(new ForumUser(5, "User005", 'M', LocalDate.of(1995, 10, 5), 0));
        listOfForumUsers.add(new ForumUser(6, "User006", 'F', LocalDate.of(2008, 10, 5), 150));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUsers);
    }
}
