package com.br.orientacaooo.desafio;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }
        public void setIdade (int idade){
            this.idade = idade;
        }
        public String getNome () {
            return nome;
        }

        public int getIdade () {
            return idade;
        }
    }