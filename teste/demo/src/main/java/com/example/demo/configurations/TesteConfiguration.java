package com.example.demo.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.services.DBService;

@Configuration
@Profile("teste")
public class TesteConfiguration {
    @Autowired
    DBService dbService;

    
}