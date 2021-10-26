package com.br.orientacaooo.server;

import com.br.orientacaooo.model.entity.Animal;
import com.br.orientacaooo.model.entity.Cachorro;
import com.br.orientacaooo.model.entity.Gato;
import com.br.orientacaooo.model.entity.Girafa;

public class Principal {
    public static void main(String[] args) {

        /* chama o metodo construtor default
        /* Animal g = new Girafa();
        g.setNomeAnimal("Gigi");
        g.setEspecie("girafa");
        g.setRaca("pinscher");
        g.setCor("malhadinha");
        g.setIdadeEmMeses(4);
        System.out.println(g); */

        // chama o metodo construtor customizado
       /* Animal c = new Girafa("Gigi", "girafa", "pinscher", "malhadinha");
        System.out.println(c);*/

        //fiz a instancia de um objeto mais especifico
        // objeto especializado
        Animal g2 = new Girafa("Nova girafa orientada a objetos", "Doberman", "Com bolinhas amarelas");
        System.out.println(g2);
        System.out.println(g2.emitirSom());
        g2.matar();
        System.out.println(g2.emitirSom());

        Animal c2 = new Cachorro("Maria Leopoldina", "Daschund", "Caramelo");
        System.out.println(c2);
        System.out.println(c2.emitirSom());
        g2.matar();
        System.out.println(g2.emitirSom());

        Gato cat = new Gato("Jojo todinho", "vira lata", "preta");
        cat.setIdadeEmMeses(15);
        System.out.println(cat);
        System.out.println(cat.emitirSom());
        g2.matar();
        System.out.println(g2.emitirSom());
        System.out.println("Idade: " + cat.getIdadeEmMeses());
        cat.isAdulto();
    }
}
