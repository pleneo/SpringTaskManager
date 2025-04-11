package com.pleneo.taskmanagerspring.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pleneo.taskmanagerspring.entities.enums.Seniority;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Occupation implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 50)
    private String name;
    private Seniority seniority;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant admission_date;

    private Instant demission_date;

    @OneToMany(mappedBy = "id.occupation")
    private Set<Employee_Occupation> employee = new HashSet<>();

    public Occupation() {
    }

    public Occupation(Long id, String name, Seniority seniority, Instant admission_date, Instant demission_date) {
        this.id = id;
        this.name = name;
        this.seniority = seniority;
        this.admission_date = admission_date;
        this.demission_date = demission_date;
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

    public Seniority getSeniority() {
        return seniority;
    }

    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }

    public Instant getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(Instant admission_date) {
        this.admission_date = admission_date;
    }

    public Instant getDemission_date() {
        return demission_date;
    }

    public void setDemission_date(Instant demission_date) {
        this.demission_date = demission_date;
    }

    @JsonIgnore
    public Set<Employee_Occupation> getEmployee() {
        return employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Occupation that = (Occupation) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
