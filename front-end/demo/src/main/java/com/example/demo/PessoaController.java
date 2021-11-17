package com.example.demo;



import com.example.demo.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
