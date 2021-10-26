package model.entity;

public class Gato extends Animal {

    private int codigoGato;

    public Gato(){}

    public Gato(String nomeAnimal, String dataNascimento, String raca, String cor, String sexo) {
        super(nomeAnimal, dataNascimento, raca, cor, sexo);
    }

    public Gato(int codigoGato){
        this.codigoGato = codigoGato;
    }

    public void setCodigoGato(int codigoGato) {
        this.codigoGato = codigoGato;
    }

    public int getCodigoGato() {
        return codigoGato;
    }
}
