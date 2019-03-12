package com.felixmutua;

import com.felixmutua.domain.Task;
import com.felixmutua.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            taskService.save(new Task(1L,"Creating a new Springboot Project", LocalDate.now(),true));
            taskService.save(new Task(2L,"Code my Springboot Project", LocalDate.now(),false));
            taskService.save(new Task(3L,"Go shopping", LocalDate.now(),false));
            taskService.save(new Task(4L,"Update Springboot Project", LocalDate.now(),false));
            taskService.save(new Task(7L,"Clean the house", LocalDate.now(),false));
            taskService.save(new Task(8L,"Present the Project", LocalDate.now(),false));
         };
    }
}
