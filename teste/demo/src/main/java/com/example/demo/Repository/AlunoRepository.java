package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    @Query("SELECT aluno FROM Aluno aluno "
            + "WHERE aluno.ativo=true ORDER BY aluno.nome")
     List<Aluno> listarTodosAbertos();

    @Query("SELECT alunos FROM Aluno aluno "
            + "WHERE aluno.ativo=false ORDER BY aluno.nome")
    List<Aluno> listarTodosFechados();

    Optional<Aluno> findByNome(String nome);
}
