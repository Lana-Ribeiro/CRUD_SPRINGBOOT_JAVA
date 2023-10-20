package com.example.demo.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Aluno;
import com.example.demo.Repository.AlunoRepository;

@Service
public class DBService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Bean
    public void instaciarDB() throws ParseException {
        Aluno aluno1 = new Aluno(1, 2344, "molker", "Lana", 8.0f, 3.0f, 10);
        Aluno aluno2 = new Aluno(2, 5678, "algumComplemento", "João", 7.5f, 4.2f, 20);
        Aluno aluno3 = new Aluno(3, 9012, "outroComplemento", "Maria", 9.2f, 5.0f, 30);
        Aluno aluno4 = new Aluno(4, 1314, "maisUmComplemento", "Pedro", 6.8f, 2.7f, 40);
        
        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
    }

}
    

