package com.pleneo.taskmanagerspring.entities;

import com.pleneo.taskmanagerspring.entities.pks.Employee_OccupationPK;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Employee_Occupation implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private Employee_OccupationPK id = new Employee_OccupationPK();

    public Employee_Occupation() {
    }

    public Employee_Occupation(Employee employee, Occupation occupation) {
        id.setEmployee(employee);
        id.setOccupation(occupation);
    }

    public Employee getEmployee() {
        return id.getEmployee();
    }

    public void setEmployee(Employee employee) {
        id.setEmployee(employee);
    }

    public Occupation getOccupation() {
        return id.getOccupation();
    }

    public void setOccupation(Occupation occupation) {
        id.setOccupation(occupation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_Occupation that = (Employee_Occupation) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
