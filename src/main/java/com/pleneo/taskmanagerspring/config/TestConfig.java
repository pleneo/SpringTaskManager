package com.pleneo.taskmanagerspring.config;

import com.pleneo.taskmanagerspring.entities.Employee;
import com.pleneo.taskmanagerspring.entities.Task;
import com.pleneo.taskmanagerspring.repositories.EmployeeRepository;
import com.pleneo.taskmanagerspring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {

        //instantiating employees in h2 database
        Employee e1 = new Employee(null, "Juscelino", "Kubitschek");
        Employee e2 = new Employee(null, "Getulio", "Vargas");
        Employee e3 = new Employee(null, "Janio", "Quadros");

        employeeRepository.saveAll(
                Arrays.asList(e1,e2,e3)
        );

        Task t1 = new Task(null, "Varrer Vassourinha", "Varrer inimigos de brasilia", Instant.now(), Instant.now(), e3);
        Task t2 = new Task(null, "Fazer 50 anos em 50", "Desenvolver 50 anos de industria no Brasil em 5 anos.", Instant.now(), Instant.now(), e1);
        Task t3 = new Task(null, "Botar o retrato do velho", "Colocar o retrato de Getúlio na estante, pois ele vai voltar.", Instant.now(), Instant.now(), e2);

        taskRepository.saveAll(
                Arrays.asList(t1,t2,t3)
        );

    }
}
