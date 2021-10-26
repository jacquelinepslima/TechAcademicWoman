package com.br.orientacaooo.desafio.heranca_constructor_sobrecarga;

public class Programador extends Pessoa {

    private String linguagem;

    //metodo               //atributos da classe
    public Programador(String nome, int idade, String linguagem) {
        super(nome, idade);
        this.linguagem = linguagem;
    } // o bloco inteiro é o construtor

    //sobrescrita metodo
    @Override
    public String showInfo() {
        return super.showInfo() + '\n' +
                " linguagem= " + linguagem;

    }
}