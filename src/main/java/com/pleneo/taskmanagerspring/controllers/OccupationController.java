package com.pleneo.taskmanagerspring.controllers;

import com.pleneo.taskmanagerspring.entities.Occupation;
import com.pleneo.taskmanagerspring.services.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/occupations")
public class OccupationController {

    @Autowired
    private OccupationService service;

    @GetMapping
    public ResponseEntity<List<Occupation>> findAll(){
        List<Occupation> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Occupation> findById(@PathVariable Long id){
        Occupation obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Occupation> insert(@RequestBody Occupation obj){
        obj = service.insert(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

//    @DeleteMapping TODO implement Delete method

//    @PutMapping TODO implement Update method

}
