package com.example.demo;



import com.example.demo.model.Pessoa;
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
    public void update(Long id, Pessoa p){

        Pessoa pessoaPesquisado = pessoaRepository.getById(id);

        if(pessoaPesquisado != null){
            pessoaPesquisado.setNome(pessoaPesquisado.getNome());
            pessoaRepository.save(pessoaPesquisado);
        }
    }

}
