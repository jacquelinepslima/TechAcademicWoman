package com.example.demo.model.controller;



import com.example.demo.model.entity.Pessoa;
import com.example.demo.model.dto.PessoaDTO;
import com.example.demo.model.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<PessoaDTO> listarTudo(){
        List<Pessoa> pessoaLista = pessoaRepository.findAll();
        return PessoaDTO.converter(pessoaLista);
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa p){
        return pessoaRepository.save(p);
    }

    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable Long id){
        Optional<Pessoa> pessoaPesquisada = pessoaRepository.findById(id);
        if (pessoaPesquisada.isPresent()){
            return pessoaRepository.getById(id);
        }
        return null;
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Pessoa p){
        pessoaRepository.save(p);
    }

}
