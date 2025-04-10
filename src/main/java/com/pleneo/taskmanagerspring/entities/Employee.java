package com.pleneo.taskmanagerspring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.*;

@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String first_name;
    private String surname;

    //one-to-many (one employee has many tasks, one task has one employee)
    @OneToMany(mappedBy = "employee")
    private List<Task> tasks = new ArrayList<>();

    @OneToMany(mappedBy = "id.employee")
    private Set<Employee_Occupation> emp_occ = new HashSet<>();


    public Employee() {
    }

    public Employee(Long id, String first_name, String surname) {
        this.id = id;
        this.first_name = first_name;
        this.surname = surname;
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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Set<Employee_Occupation> getEmp_occ() {
        return emp_occ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
