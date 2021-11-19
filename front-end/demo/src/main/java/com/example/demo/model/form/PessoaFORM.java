package com.example.demo.model.form;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PessoaFORM {

    @NotNull
    @NotEmpty
    @Min(value = 3)
    private String nome;

    @NotNull
    @NotEmpty
    private  String sobrenome;
}
