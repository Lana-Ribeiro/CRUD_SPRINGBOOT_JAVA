package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Aluno;
import com.example.demo.Repository.AlunoRepository;


@Service
public class FaculdadeService {
    @Autowired
    AlunoRepository alunoRepository;
    
    public Aluno findById(Integer ra) {
        Optional<Aluno> aluno = alunoRepository.findById(ra);
        return aluno.orElse(null);
    }

    public List<Aluno> listarTodosAbertos() {
        return alunoRepository.listarTodosAbertos();
    }

    public List<Aluno> listarTodosFechados() {
        return alunoRepository.listarTodosFechados();
    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Aluno findByNome(String nome) {
        Optional<Aluno> aluno = alunoRepository.findByNome(nome);
        return aluno.orElse(null);
    }

    public Aluno gravarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletar(Integer ra) {
        alunoRepository.deleteById(ra);
    }

    public Aluno update(Integer ra, Aluno aluno, Aluno complemento, Aluno nome, Aluno notaAdo1,Aluno notaPi, Aluno numero)  {
        Aluno alterado = findById(ra);
        if(alterado!=null){
            alterado.setNome(aluno.getNome());
            alterado.setCep(aluno.getCep());
            alterado.setComplemento(aluno.getComplemento());
            alterado.setNotaAdo1(aluno.getNotaAdo1());
            alterado.setNotaPi(aluno.getNotaPi());
            alterado.setNumero(aluno.getNumero());
        
            return alunoRepository.save(alterado);
        }
        return null;
    }
}
