package com.pleneo.taskmanagerspring.repositories;

import com.pleneo.taskmanagerspring.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
