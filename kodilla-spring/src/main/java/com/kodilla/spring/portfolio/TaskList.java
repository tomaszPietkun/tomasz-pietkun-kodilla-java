package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    List<String> tasks;

    @Autowired
    public TaskList() {
        tasks = new ArrayList<>();
    }
}
