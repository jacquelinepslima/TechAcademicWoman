package com.br.orientacaooo.desafio.abstracao;

public abstract class MeuLivro {
    private String nome;

    public MeuLivro(String nome){
        this.nome = nome;
    }



    @Override
    public String toString() {
        return "MeuLivro{" +
                nome +
                '}';
    }
}
