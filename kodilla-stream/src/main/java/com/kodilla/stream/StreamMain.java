package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.time.LocalDate.*;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getForumUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() <= (now().getYear() - 20))
                .filter(forumUser -> forumUser.getPostsPublished() >= 1)
                .collect(Collectors.toMap(ForumUser::getPersonalId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }
}
