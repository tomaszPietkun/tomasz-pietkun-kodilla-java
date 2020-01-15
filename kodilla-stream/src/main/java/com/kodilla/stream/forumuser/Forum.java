package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "Faker", 'M', LocalDate.of(1999, 8, 6), 3));
        forumUsers.add(new ForumUser(2, "Bjergsen", 'M', LocalDate.of(1996, 2, 24), 45));
        forumUsers.add(new ForumUser(3, "DoubleLift", 'M', LocalDate.of(2001, 3, 23), 643));
        forumUsers.add(new ForumUser(4, "Jula2000", 'F', LocalDate.of(2000, 11, 10), 1001));
        forumUsers.add(new ForumUser(5, "Blondi22", 'F', LocalDate.of(1997, 02, 28), 1));
        forumUsers.add(new ForumUser(6, "Jankos", 'M', LocalDate.of(1995, 4, 26), 0));
        forumUsers.add(new ForumUser(7, "TommyTrain", 'M', LocalDate.of(1999, 3, 30), 21));
        forumUsers.add(new ForumUser(8, "MSa", 'F', LocalDate.of(1999, 4, 9), 31));
        forumUsers.add(new ForumUser(9, "MaciekRomek12221", 'M', LocalDate.of(1999, 4, 23), 112));
        forumUsers.add(new ForumUser(10, "RL9", 'M', LocalDate.of(1989, 12, 11), 0));
    }

    public List<ForumUser> getForumUsersList() {
        return new ArrayList<>(forumUsers);
    }
}
