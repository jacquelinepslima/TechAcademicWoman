package model.entity;

public class Cachorro extends Animal {

    private int codigoCachorro;

    public Cachorro(String nomeAnimal, String dataNascimento, String raca, String cor, String sexo) {
        super(nomeAnimal, dataNascimento, raca, cor, sexo);
    }

    public Cachorro(String nome, String dataNascimento, String raca, String cor, String sexo, int codigoDono) {
    }

    public Cachorro() {}

    public Cachorro(int codigoCachorro){
        this.codigoCachorro = codigoCachorro;
    }

    public void setCodigoCachorro(int codigoCachorro) {
        this.codigoCachorro= codigoCachorro;
    }

    public int getCodigoCachorro() {
        return codigoCachorro;
    }
}