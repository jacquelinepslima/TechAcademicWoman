package com.controle_despesa.model.form;

import com.controle_despesa.model.entity.Categoria;
import com.controle_despesa.model.repositories.CategoriaRepository;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//post
@Setter
public class CategoriaFORM {

    @NotNull
    @NotEmpty
    @Min(value = 3)
    private String descricao;

    public Categoria converter(CategoriaRepository repository){
       Categoria c = new Categoria();
       c.setDescricao(descricao);
       return repository.save(c);
    }

}
