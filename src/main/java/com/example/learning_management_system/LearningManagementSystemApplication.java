package com.example.learning_management_system;

import com.example.learning_management_system.model.Message;
import com.example.learning_management_system.service.EnrichmentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningManagementSystemApplication {

    public static void main(String[] args) {
        ApplicationContext a = SpringApplication.run(LearningManagementSystemApplication.class, args);
        System.out.println(a.getBean(EnrichmentService.class).getEnrichmentImpl().values());

    }

}
