package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTesting {
    
@GetMapping(value ="/")
    public String getPage(){
        return "Ola Lana";
    }
}

