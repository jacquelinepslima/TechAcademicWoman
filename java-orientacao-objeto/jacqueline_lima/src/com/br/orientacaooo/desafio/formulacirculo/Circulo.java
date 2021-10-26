package com.br.orientacaooo.desafio.formulacirculo;

public abstract class Circulo implements Forma {
    //definir uma propriedade numérica fracionária chamada raio ok
    protected double raio;
    protected double aCirculo;

    //classe definida não pode ser pública
    public Circulo(double raio){
        this.raio = raio;
    }
    //retornar a area do circulo
    public double getaCirculo(){
        return aCirculo;
    }

}
