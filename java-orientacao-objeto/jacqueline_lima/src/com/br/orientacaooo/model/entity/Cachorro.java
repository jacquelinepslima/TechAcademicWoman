package com.br.orientacaooo.model.entity;

public class Cachorro extends Animal{
    public Cachorro(String nomeAnimal, String raca, String cor){
        super(nomeAnimal, "Cachorro", raca, cor);
    }

    @Override
    public String emitirSom() {
        if (isVivo()) {
            return "au au";
        }
        return " Animal morto não emite som";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nomeAnimal='" + nomeAnimal + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", idadeEmMeses=" + idadeEmMeses +
                '}';
    }

    @Override
    public boolean isAdulto() {
        if (isVivo()){
            if( idadeEmMeses >=24){
                return true;
            }
            return false;
        }
        else if(isVivo()){
            if(idadeEmMeses >= 12){
                return true;
            }
            return false;
        }
        return false;
    }
}
