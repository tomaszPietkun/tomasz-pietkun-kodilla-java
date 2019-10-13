package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int personalId;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsPublished;

    public ForumUser(int personalId, String username, char sex, LocalDate dateOfBirth, int postsPublished) {
        this.personalId = personalId;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsPublished = postsPublished;
    }

    public int getPersonalId() {
        return personalId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsPublished() {
        return postsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "personalId=" + personalId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsPublished=" + postsPublished +
                '}';
    }
}
