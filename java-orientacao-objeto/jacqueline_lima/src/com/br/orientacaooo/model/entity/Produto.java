package com.br.orientacaooo.model.entity;

// objeto que representa minha tabela no banco
// MAS COM PARTICULARIDADES DO JAVA - CONSTRUTOR/METODO/GET/SET

public class Produto {

    private int codigoProduto;
    private String descricaoProduto;
    private Double precoProduto;


    public Produto(){}


    public Produto(String descricaoProduto, Double precoProduto){
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
    }



    public int getCodigoProduto(){
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto(){
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getPrecoProduto(){
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigoProduto=" + codigoProduto +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", precoProduto=" + precoProduto +
                '}' + '\n';
    }
}
