package model.entity;

public class Girafa extends Animal{
    private int codigoGirafa;

    public Girafa(){}

    public Girafa(String nomeAnimal, String dataNascimento, String raca, String cor, String sexo) {
        super(nomeAnimal, dataNascimento, raca, cor, sexo);
    }

    public Girafa(int codigoGirafa){
        this.codigoGirafa = codigoGirafa;
    }

    public void setCodigoGirafa(int codigoGirafa) {
        this.codigoGirafa= codigoGirafa;
    }

    public int getCodigoGirafa() {
        return codigoGirafa;
    }
}
