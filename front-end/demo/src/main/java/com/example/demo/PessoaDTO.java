package com.example.demo;

import com.example.demo.model.Pessoa;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class PessoaDTO {
    private Long id;
    private String nome;
    private String sobrenome;

    public PessoaDTO(Pessoa pessoa){
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.sobrenome = pessoa.getSobrenome();
    }

    public static List<PessoaDTO> converter(List<Pessoa> Pessoas){
        return Pessoas.stream().map(PessoaDTO::new).collect(Collectors.toList());
    }
}

