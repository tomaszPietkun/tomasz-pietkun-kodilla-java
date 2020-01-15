package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskList() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board taskList = context.getBean(Board.class);
        //When
        List<String> toDoList = new ArrayList<String>();
        toDoList.add("Pass Session");
        List<String> inProgressList = new ArrayList<String>();
        inProgressList.add("Finish Bootcamp");
        List<String> doneList = new ArrayList<String>();
        doneList.add("Travel to Australia");
        //Then
        taskList.readList();
    }
}
