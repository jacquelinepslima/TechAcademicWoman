package com.br.orientacaooo.desafio.consultorio_dentista.model;

import java.util.Date;

public class Dentista {
    private String nome;
    private String sobrenome;
    private String especialidade;
    private int numeroRegistro;
    private boolean status;
    private Date data;

    public Dentista(String nome, String sobrenome, String especialidade, int numeroRegistro, boolean status){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.especialidade = especialidade;
        this.numeroRegistro = numeroRegistro;
        this.status = true;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome () {
        return this.sobrenome;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public int getNumeroRegistro(){
        return this.numeroRegistro;
    }

    public boolean getStatus(){
        return this.status;
    }

    public Date getData() {return data;}

    public void setStatus(boolean status){
        this.status = status;
    }

    public void setData(Date data) { this.data = data; }


    @Override
    public String toString() {
        return "Dentista{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", numeroRegistro=" + numeroRegistro +
                ", status=" + status +
                '}';
    }
}
