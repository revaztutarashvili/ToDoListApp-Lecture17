package com.example.ToDoList_Lecture_17.controller;

import com.example.ToDoList_Lecture_17.config.Configuration;
import com.example.ToDoList_Lecture_17.model.Task;
import com.example.ToDoList_Lecture_17.service.HomeWorkService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeWorkController {
    private final HomeWorkService homeWorkService;

    public HomeWorkController(@Qualifier("private") HomeWorkService homeWorkService) {
        this.homeWorkService = homeWorkService;
    }

    @GetMapping("/get-homeWork(@Qualifier)")
    public HomeWorkService getHomeWork (){
        return homeWorkService;
    }



}
