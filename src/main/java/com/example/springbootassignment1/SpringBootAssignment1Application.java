package com.example.springbootassignment1;

import com.example.springbootassignment1.engine.Car;
import com.example.springbootassignment1.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAssignment1Application implements CommandLineRunner {

    @Autowired
    private Car car;
    private Student student;
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootAssignment1Application.class, args);

        Student student= (Student) context.getBean("student");
        System.out.println(student.getName("sudip"));
    }

    @Override
    public void run(String... args) throws Exception {
        car.getEngineDetails();
    }
}
