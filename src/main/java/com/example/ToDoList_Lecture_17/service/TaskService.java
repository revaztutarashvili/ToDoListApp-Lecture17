package com.example.ToDoList_Lecture_17.service;
import com.example.ToDoList_Lecture_17.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskService {
    private final List<Task> taskList = new ArrayList<>();


    public void createTask (Task tasks){
    taskList.add(tasks);
    }


    public void deleteTask (int index){
        taskList.remove(index);
    }

    public Task updateTask (int index, Task tasks){
    if ( index > taskList.size() && index > -1 ){
    Task oldTask = taskList.get(index);
    oldTask.setTaskName(tasks.getTaskName());
    oldTask.setTaskTime(tasks.getTaskTime());
    oldTask.setTaskInfo(tasks.getTaskInfo());
    }
    return tasks;
    }


    public Task getTaskByIndex (int index){
        return taskList.get(index);
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}
