package com.pleneo.taskmanagerspring.dtos;

import com.pleneo.taskmanagerspring.entities.Employee;

import java.io.Serializable;
import java.util.Objects;

public class TaskAuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String first_name;
    private String surname;

    public TaskAuthorDTO() {
    }

    public TaskAuthorDTO(Employee emp){
        id = emp.getId();
        first_name = emp.getFirst_name();
        surname = emp.getSurname();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
