package com.pleneo.taskmanagerspring.config;

import com.pleneo.taskmanagerspring.dtos.TaskAuthorDTO;
import com.pleneo.taskmanagerspring.entities.Employee;
import com.pleneo.taskmanagerspring.entities.Employee_Occupation;
import com.pleneo.taskmanagerspring.entities.Occupation;
import com.pleneo.taskmanagerspring.entities.Task;
import com.pleneo.taskmanagerspring.entities.enums.Seniority;
import com.pleneo.taskmanagerspring.repositories.EmployeeRepository;
import com.pleneo.taskmanagerspring.repositories.Employee_OccupationRepository;
import com.pleneo.taskmanagerspring.repositories.OccupationRepository;
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

    @Autowired
    private OccupationRepository occupationRepository;

    @Autowired
    private Employee_OccupationRepository employeeOccupationRepository;

    @Override
    public void run(String... args) throws Exception {

        //Employees to h2 database
        Employee e1 = new Employee(null, "Juscelino", "Kubitschek");
        Employee e2 = new Employee(null, "Getulio", "Vargas");
        Employee e3 = new Employee(null, "Janio", "Quadros");

        employeeRepository.saveAll(
                Arrays.asList(e1,e2,e3)
        );

        //Tasks to h2 database
        Task t1 = new Task(null, "Varrer Vassourinha", "Varrer inimigos de brasilia", Instant.now(), Instant.now(), e3, new TaskAuthorDTO(e3));
        Task t2 = new Task(null, "Fazer 50 anos em 5", "Desenvolver 50 anos de industria no Brasil em 5 anos.", Instant.now(), Instant.now(), e1, new TaskAuthorDTO(e1));
        Task t3 = new Task(null, "Botar o retrato do velho", "Colocar o retrato de Getúlio na estante, pois ele vai voltar.", Instant.now(), Instant.now(), e2, new TaskAuthorDTO(e2));

        taskRepository.saveAll(
                Arrays.asList(t1,t2,t3)
        );

        //Occupations to h2 database
        Occupation o1 = new Occupation(null, "Tech Lead", Seniority.JUNIOR);
        Occupation o2 = new Occupation(null, "Front-End Developer", Seniority.SENIOR);
        Occupation o3 = new Occupation(null, "Back-End Developer", Seniority.INTERN);

        occupationRepository.saveAll(
                Arrays.asList(o1,o2,o3)
        );

        //Employee_Occupations to h2 database
        Employee_Occupation eo1 = new Employee_Occupation(e1, o2);
        Employee_Occupation eo2 = new Employee_Occupation(e2, o1);
        Employee_Occupation eo3 = new Employee_Occupation(e3, o3);

        employeeOccupationRepository.saveAll(
                Arrays.asList(eo1,eo2,eo3)
        );

    }
}
