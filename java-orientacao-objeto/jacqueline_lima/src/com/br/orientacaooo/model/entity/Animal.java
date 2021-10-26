package com.br.orientacaooo.model.entity;

import com.br.orientacaooo.model.dao.IAnimal;

public abstract class Animal implements IAnimal {

        //definido as propriedades do objeto e visibilidade
        //visibilidade colocada em privado
    protected String nomeAnimal;
    protected String especie;
    protected String raca;
    protected String cor;
    protected int idadeEmMeses;
    protected String sexo;
    private boolean vivo; // valor default = falso boolean

    //construtor DEFAULT | padrao | vazio
    public Animal(){
        System.out.println("objeto construido");
        this.vivo = true;
    }

    public Animal(String nomeAnimal, String especie, String raca, String cor){
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
        this.vivo = true;
    }


    //metodo acessor para receber os valores das propriedades
    public void setNomeAnimal(String nomeAnimal){
        this.nomeAnimal = nomeAnimal;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setIdadeEmMeses(int idadeEmMeses){ this.idadeEmMeses = idadeEmMeses; }


    //metodo acessor para devolver os valores das propriedades
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public int getIdadeEmMeses() { return idadeEmMeses; }

    public abstract String emitirSom();
    public abstract boolean isAdulto();
    public void matar(){
        this.vivo = false;
    }
    public boolean isVivo(){
        return vivo;
    }

    public String getSexo(){
        return sexo;
    }



    @Override // -- estou sobrescrevendo o metodo da minha SUPER CLASS | classe mae
    public String toString() {
        return "Animal{" +
                "nomeAnimal='" + nomeAnimal + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", idadeEmMeses=" + idadeEmMeses +
                '}';
    }
}
