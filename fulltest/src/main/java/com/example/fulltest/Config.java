package com.example.fulltest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan("com.example.fulltest")
public class Config {

    @Bean
    @DependsOn({"Branch","Customer"})
    public Appointment appointment(){
        return new Appointment();
    }

    @Bean("Branch")
    public Branch branch(){
        return new Branch();
    }

    @Bean("Customer")
    public Customer customer(){
        return new Customer();
    }

}
