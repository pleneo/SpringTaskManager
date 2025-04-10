package com.pleneo.taskmanagerspring.services;

import com.pleneo.taskmanagerspring.entities.Task;
import com.pleneo.taskmanagerspring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    //GET method to return all tasks in a List.
    public List<Task> findAll(){
        return repository.findAll();
    }

    //GET method to return a specific Task by his id.
    public Task findById(Long id){
        Optional<Task> obj = repository.findById(id);
        return obj.get();
    }

    //POST method to insert a new Task in the database.
    public Task insert(Task obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        // TODO implement delete method
        return;
    }

    public Task update(Long id, Task obj){
        // TODO: implement update method
        return null;
    }







}
