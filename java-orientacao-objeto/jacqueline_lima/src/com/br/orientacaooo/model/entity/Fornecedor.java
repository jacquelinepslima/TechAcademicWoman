package com.br.orientacaooo.model.entity;

public class Fornecedor {
    private int codigoFornecedor;
    private String nomeFornecedor;
    private String cnpj;

    public Fornecedor(){}


    public Fornecedor(String nomeFornecedor, String cnpj){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
    }

    public Fornecedor(int codigo_fornecedor) {
        this.codigoFornecedor = codigo_fornecedor;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "codigoFornecedor=" + codigoFornecedor +
                ", nomeFornecedor='" + nomeFornecedor + '\'' +
                ", cnpj=" + cnpj +
                '}' + '\n';
    }
}
