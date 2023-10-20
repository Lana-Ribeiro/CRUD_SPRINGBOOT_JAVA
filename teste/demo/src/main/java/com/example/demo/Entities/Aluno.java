package com.example.demo.Entities;
import java.io.Serial;
//
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "Aluno")

public class Aluno implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column (name = "CEP")
    int cep;

    @Column (name = "Complemento")
    String complemento;

    @Column (name = "Nome")
    String nome;

    @Column (name = "NotaAdo1")
    float notaAdo1;

    @Column (name = "NotaPi")
    float notaPi;
    
    @Column (name = "Numero")
    int numero;
    

    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getNotaAdo1() {
        return notaAdo1;
    }
    public void setNotaAdo1(float notaAdo1) {
        this.notaAdo1 = notaAdo1;
    }
    public float getNotaPi() {
        return notaPi;
    }
    public void setNotaPi(float notaPi) {
        this.notaPi = notaPi;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Column
    Date dataCadastro;

    public Aluno(int i, int j, String string, String string2, float f, float g, int k) {
    }

    @Override
    public String toString() {
        return "Aluno: " +
        "ra = " + ra +
        ", cep = " + cep +
        ", complemento = " + complemento +
        ", nome = " + nome +
        ", nota ado 1 = " + notaAdo1 +
        ", nota PI = " + notaPi +
        ", Numero = " + numero + "\n";
}
    }