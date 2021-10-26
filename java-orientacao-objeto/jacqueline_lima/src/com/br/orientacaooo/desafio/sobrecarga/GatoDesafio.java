package com.br.orientacaooo.desafio.sobrecarga;

public class GatoDesafio extends AnimalDesafio {
    @Override
    public String getEspecie() {
        return getNome() + " é um Gato";
    }
}
