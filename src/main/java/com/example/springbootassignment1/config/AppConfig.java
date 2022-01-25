package com.example.springbootassignment1.config;


import com.example.springbootassignment1.student.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean(name = "student")
    public Student student(){
        return new Student();
    }


}
