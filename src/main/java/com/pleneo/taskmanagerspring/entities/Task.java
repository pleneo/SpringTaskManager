package com.pleneo.taskmanagerspring.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Task implements Serializable {

    // TODO: implement Spring Annotations

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String description;
    private Instant deadline;
    private Instant created_date;

    //many-to-one cardinality implementation (one Task has one employee, one employee has many tasks)
    private Employee employee;

    public Task() {
    }

    public Task(Long id, String name, String description, Instant deadline, Instant created_date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.created_date = created_date;
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
