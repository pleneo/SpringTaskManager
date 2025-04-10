package com.pleneo.taskmanagerspring.repositories;

import com.pleneo.taskmanagerspring.entities.Employee_Occupation;
import com.pleneo.taskmanagerspring.entities.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Employee_OccupationRepository extends JpaRepository<Employee_Occupation, Long> {
}
