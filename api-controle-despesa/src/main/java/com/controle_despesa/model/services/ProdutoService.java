package com.controle_despesa.model.services;

import com.controle_despesa.model.entity.Produto;
import com.controle_despesa.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Classe que concentra as regras de negocio
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public void inativar(Long id){
        Produto produtoExcluir = repository.getById(id);
        produtoExcluir.setStatus(false);
        repository.save(produtoExcluir);
    }
}
