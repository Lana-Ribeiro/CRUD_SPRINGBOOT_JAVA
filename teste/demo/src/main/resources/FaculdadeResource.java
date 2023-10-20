package com.example.demo.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Entities.Aluno;
import com.example.demo.services.FaculdadeService;

@RestController
@RequestMapping(value = "/faculdade")
public class FaculdadeResource {
    @Autowired
    private FaculdadeService faculdadeService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findByRA(@PathVariable Integer id){
        Aluno aluno = faculdadeService.findById(id);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping(value ="/abertos")
    public ResponseEntity<List<Aluno>> listarAbertos(){
        List<Aluno> aluno =
                faculdadeService.listarTodosAbertos();
        return ResponseEntity.ok().body(aluno);
    }
    @GetMapping(value ="/fechados")
    public ResponseEntity<List<Aluno>> listarTodosFechados(){
        List<Aluno> aluno =
                faculdadeService.listarTodosFechados();
        return ResponseEntity.ok().body(aluno);
    }
    @GetMapping
    public List<Aluno> findAll(){
        List<Aluno> aluno = faculdadeService.findAll();
        return aluno;
    }

    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<Aluno> findByNome(@PathVariable String nome){
        Aluno aluno = faculdadeService.findByNome(nome);
        return ResponseEntity.ok().body(aluno);
    }
    @PostMapping
    public ResponseEntity<Aluno> gravarAluno(
            @RequestBody Aluno aluno){
        aluno = faculdadeService.gravarAluno(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ra}").
                buildAndExpand(aluno.getRa()).toUri();
        return ResponseEntity.created(uri).body(aluno);
    }
    @DeleteMapping(value = "/{ra}")
    public ResponseEntity<Void> deletar(@PathVariable Integer ra){
        faculdadeService.deletar(ra);
        return ResponseEntity.noContent().build();
    }
    @PutMapping(value = "/{ra}")
    public ResponseEntity<Aluno> update(@PathVariable Integer ra,
                                        @RequestBody Aluno aluno){
        Aluno alterado = faculdadeService.update(ra, aluno);
        return ResponseEntity.ok().body(alterado);
    }



}