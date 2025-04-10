package com.pleneo.taskmanagerspring.services;

import com.pleneo.taskmanagerspring.entities.Employee;
import com.pleneo.taskmanagerspring.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    //GET method to return all employees in a List.
    public List<Employee> findAll(){
        return repository.findAll();
    }

    //GET method to return a specific Employee by his id.
    public Employee findById(Long id){
        Optional<Employee> obj = repository.findById(id);
        return obj.get();
    }

    //POST method to insert a new Employee in the database.
    public Employee insert(Employee obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        // TODO implement delete method
        return;
    }

    public Employee update(Long id, Employee obj){
        // TODO: implement update method
        return null;
    }







}
