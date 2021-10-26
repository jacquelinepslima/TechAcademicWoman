package com.br.orientacaooo.desafio.heranca_constructor_sobrecarga;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String showInfo(){
        return "Nome= " + nome + "\n"  +
                ", idade=" + idade + "\n";
    }
}

