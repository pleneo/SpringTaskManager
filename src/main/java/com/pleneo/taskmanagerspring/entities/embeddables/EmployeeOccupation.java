package com.pleneo.taskmanagerspring.entities.embeddables;

import com.pleneo.taskmanagerspring.entities.Employee;
import com.pleneo.taskmanagerspring.entities.Occupation;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeOccupation implements Serializable {


    // TODO: implement Spring Annotations


    private static final long serialVersionUID = 1L;

    private Employee employee;

    private Occupation occupation;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeOccupation that = (EmployeeOccupation) o;
        return Objects.equals(employee, that.employee) && Objects.equals(occupation, that.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, occupation);
    }
}
