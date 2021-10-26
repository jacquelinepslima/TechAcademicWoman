package com.br.orientacaooo.desafio.atividade_hotel.exceptions;

public class ReservationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ReservationException(String mensagem){
        super(mensagem);
    }
}
