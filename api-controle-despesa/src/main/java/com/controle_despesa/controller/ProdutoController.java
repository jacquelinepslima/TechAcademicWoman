package com.controle_despesa.controller;


import com.controle_despesa.model.dto.ProdutoDTO;
import com.controle_despesa.model.entity.Produto;
import com.controle_despesa.model.repositories.ProdutoRepository;
import com.controle_despesa.model.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired //injecao de dependencia
    private ProdutoRepository repository;
    private ProdutoService service;

    @GetMapping
    public List<ProdutoDTO> listarTudo() {
        List<Produto> produtoLista = repository.findAll();
        return ProdutoDTO.converter(produtoLista);
    }

    @PostMapping
    public void salvar(@RequestBody Produto produto){
        repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id, @RequestBody Produto produto){
        Produto produtoPesquisada = repository.getOne(id);
        if(produtoPesquisada != null){
            produtoPesquisada.setDescricao(produto.getDescricao());
            repository.save(produtoPesquisada);
        }
    }

    @PatchMapping("/{id}")
    public void inativar(@PathVariable Long id){
        service.inativar(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id){
        Produto produto = service.findById(id);
        return ResponseEntity.ok().body(produto);
    }
}
