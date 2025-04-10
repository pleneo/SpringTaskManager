package com.pleneo.taskmanagerspring.repositories;

import com.pleneo.taskmanagerspring.entities.Employee;
import com.pleneo.taskmanagerspring.entities.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OccupationRepository extends JpaRepository<Occupation, Long> {
}
