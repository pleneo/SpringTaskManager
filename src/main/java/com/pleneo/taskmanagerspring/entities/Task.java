package com.pleneo.taskmanagerspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pleneo.taskmanagerspring.dtos.TaskAuthorDTO;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
public class Task implements Serializable {

    // TODO: implement Spring Annotations

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Instant deadline;
    private Instant created_date;

    //many-to-one cardinality implementation (one Task has one employee, one employee has many tasks)
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private TaskAuthorDTO author;

    public Task() {
    }

    public Task(Long id, String name, String description, Instant deadline, Instant created_date, Employee employee, TaskAuthorDTO author) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.created_date = created_date;
        this.employee = employee;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getDeadline() {
        return deadline;
    }

    public void setDeadline(Instant deadline) {
        this.deadline = deadline;
    }

    public Instant getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Instant created_date) {
        this.created_date = created_date;
    }

    public TaskAuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(TaskAuthorDTO authorDTO) {
        this.author = authorDTO;
    }

    @JsonIgnore
    public Employee getEmployee() {
        return employee;
    }

    // TODO create DTO to employee to show his name and avoid making loop calls in API requests.

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
