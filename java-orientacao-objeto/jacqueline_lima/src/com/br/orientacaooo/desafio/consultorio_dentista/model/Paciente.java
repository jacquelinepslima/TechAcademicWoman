package com.br.orientacaooo.desafio.consultorio_dentista.model;

public class Paciente {
    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;
    private String telefone;
    private String endereco;

    public Paciente(int codigo, String nome, String sobrenome, int idade, String sexo, String telefone, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return this.codigo;
    }
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome () {
        return this.sobrenome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getSexo(){
        return this.sexo;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }


    public void marcarConsulta(){
        // TODO: 21/09/2021 implementar metodo do
    }
    public void consultarConsulta(){
        // TODO: 21/09/2021 implementar metodo do
    }
    public void remarcarConsulta(){
        // TODO: 21/09/2021 implementar metodo do
    }
    public void cancelarConsulta(){
        // TODO: 21/09/2021 implementar metodo do
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
