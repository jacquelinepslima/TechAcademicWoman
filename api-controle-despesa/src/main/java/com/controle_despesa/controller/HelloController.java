package com.controle_despesa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //essa classe vai ser um controller, abre as portas API
@RequestMapping("/hello") //path ou endereco do recurso(url)
public class HelloController {

    @GetMapping //o tipo de verbo que a API irá receber
    public String getHello(){
        return "Hello Spring";
    }

    @GetMapping("/nome_completo")
        public String nomeCompleto(){
        return "Jacqueline Lima";
    }

}
