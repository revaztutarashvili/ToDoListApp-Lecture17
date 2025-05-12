package com.example.ToDoList_Lecture_17.config;

import com.example.ToDoList_Lecture_17.service.HomeWorkService;
import com.example.ToDoList_Lecture_17.service.PrivateHWService;
import com.example.ToDoList_Lecture_17.service.SchoolHWService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@org.springframework.context.annotation.Configuration
public class Configuration {


    @Bean
    @Qualifier ("private")
    public HomeWorkService getPrivateHWService() {
        return new PrivateHWService();

    }

    @Bean
    public HomeWorkService getSchoolHWService() {
        return new SchoolHWService();
    }

}
