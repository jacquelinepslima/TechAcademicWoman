package model.entity;

public class DonoAnimal extends Animal{
    private int codigoDono;
    private String nomeDono;
    private String endereco;

    public DonoAnimal(String nomeDono, String endereco){
        this.nomeDono = nomeDono;
        this.endereco = endereco;
    }

    public DonoAnimal(){}

    public int getCodigoDono() {
        return codigoDono;
    }

    public void setCodigoDono(int codigoDono) {
        this.codigoDono = codigoDono;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
