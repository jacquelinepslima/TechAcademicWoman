package com.controle_despesa.model.services;

import com.controle_despesa.model.form.CategoriaFORM;
import com.controle_despesa.model.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public void save(@Valid CategoriaFORM categoria){

    }
}
