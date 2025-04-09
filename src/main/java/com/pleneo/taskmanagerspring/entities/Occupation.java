package com.pleneo.taskmanagerspring.entities;

import com.pleneo.taskmanagerspring.entities.enums.Seniority;

import java.io.Serializable;
import java.util.Objects;

public class Occupation implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Seniority seniority;

    // TODO: implement Employee - Occupation many-to-many logic.

    public Occupation() {
    }

    public Occupation(Long id, String name, Seniority seniority) {
        this.id = id;
        this.name = name;
        this.seniority = seniority;
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
