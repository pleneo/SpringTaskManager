package com.pleneo.taskmanagerspring.repositories;

import com.pleneo.taskmanagerspring.entities.Employee;
import com.pleneo.taskmanagerspring.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
