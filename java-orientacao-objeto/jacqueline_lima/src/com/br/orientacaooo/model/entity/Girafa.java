package com.br.orientacaooo.model.entity;

// esse objeto é um animal
public class Girafa extends Animal{

    public Girafa(String nomeAnimal, String raca, String cor){
        super(nomeAnimal, "Girafa", raca, cor);
    }

    @Override
    public String emitirSom() {
        if (isVivo()) {
            return "fiu fiu";
        }
        return " Animal morto não emite som";
    }
    @Override
    public String toString() {
        return "Gato{" +
                "nomeAnimal='" + nomeAnimal + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", idadeEmMeses=" + idadeEmMeses +
                '}';
    }

    @Override
    public boolean isAdulto() {
        if (this.sexo == "femea"){
            if(idadeEmMeses >=36){
                return true;
            }
            else return false;
        }
        else if(this.sexo == "macho"){
            if(idadeEmMeses >= 48){
                return true;
            }
            else return false;
        }
        return false;
    }
}
