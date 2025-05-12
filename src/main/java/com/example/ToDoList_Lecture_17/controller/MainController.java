package com.example.ToDoList_Lecture_17.controller;

import com.example.ToDoList_Lecture_17.model.Task;
import com.example.ToDoList_Lecture_17.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {


    private final TaskService taskService;

    public MainController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping("/create-task")
    public Task createTask (@RequestBody Task task){
        taskService.createTask(task);
        return task;
    }

    @DeleteMapping ("delete-task/{taskIndex}")
    public void deleteTask (@PathVariable ("taskIndex") Integer index){
        taskService.deleteTask(index);
    }

    @PutMapping("/update-task/{taskIndex}")
    public Task updateTask (@PathVariable("taskIndex") Integer index ,@RequestBody Task task){
        return taskService.updateTask(index, task);

    }

    @GetMapping ("/get-tasklist-by-index/{taskIndex}")
    public Task getTaskByIndex (@PathVariable ("taskIndex") Integer index ){
        return taskService.getTaskByIndex(index);
    }

    @GetMapping ("/get-tasklist")
    public List<Task> getTaskList (){
       return taskService.getTaskList();
    }


}
