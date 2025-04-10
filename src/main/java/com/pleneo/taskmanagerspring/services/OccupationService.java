package com.pleneo.taskmanagerspring.services;

import com.pleneo.taskmanagerspring.entities.Occupation;
import com.pleneo.taskmanagerspring.entities.Occupation;
import com.pleneo.taskmanagerspring.repositories.OccupationRepository;
import com.pleneo.taskmanagerspring.repositories.OccupationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OccupationService {

    @Autowired
    private OccupationRepository repository;

    //GET method to return all occupations in a List.
    public List<Occupation> findAll(){
        return repository.findAll();
    }

    //GET method to return a specific Occupation by his id.
    public Occupation findById(Long id){
        Optional<Occupation> obj = repository.findById(id);
        return obj.get();
    }

    //POST method to insert a new Occupation in the database.
    public Occupation insert(Occupation obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        // TODO implement delete method
        return;
    }

    public Occupation update(Long id, Occupation obj){
        // TODO: implement update method
        return null;
    }







}
