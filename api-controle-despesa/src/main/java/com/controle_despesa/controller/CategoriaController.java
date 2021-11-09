package com.controle_despesa.controller;

import com.controle_despesa.model.dto.CategoriaDTO;
import com.controle_despesa.model.entity.Categoria;
import com.controle_despesa.model.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired //injecao de dependencia
    private CategoriaRepository repository;

    @GetMapping
    public List<CategoriaDTO> listarTudo() {
        List<Categoria> categoriaLista = repository.findAll();
        return CategoriaDTO.converter(categoriaLista);
    }

    @PostMapping
    public void salvar(@RequestBody Categoria categoria){
        repository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id, @RequestBody Categoria categoria){
        Categoria categoriaPesquisada = repository.getOne(id);
        if(categoriaPesquisada != null){
            categoriaPesquisada.setDataCadastro(categoria.getDataCadastro());
            repository.save(categoriaPesquisada);
        }
    }
}
