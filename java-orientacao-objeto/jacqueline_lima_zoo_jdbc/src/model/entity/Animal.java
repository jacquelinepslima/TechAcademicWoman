package model.entity;

import java.util.Calendar;

public class Animal {
    private String nomeAnimal;
    private String dataNascimento;
    private String raca;
    private String cor;
    private String sexo;
    private String dataCadastro;

    public Animal() {}

    public Animal(String nomeAnimal, String dataNascimento, String raca, String cor, String sexo){
        this.nomeAnimal = nomeAnimal;
        this.dataNascimento = dataNascimento;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
    }



    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nomeAnimal='" + nomeAnimal + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
