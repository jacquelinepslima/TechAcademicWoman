package com.br.orientacaooo.model.entity;

public class Gato extends Animal{
    public Gato(String nomeAnimal, String raca, String cor) {
        super(nomeAnimal, "Gato", raca, cor);
    }

    @Override
    public String emitirSom() {
        if (isVivo()) {
            return "miau miau";
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
            if(idadeEmMeses >=12){
                return true;
            }
            else return false;
        }
        else if(this.sexo == "macho"){
            if(idadeEmMeses >= 12){
                return true;
            }
            else return false;
        }
        return false;
    }
}
