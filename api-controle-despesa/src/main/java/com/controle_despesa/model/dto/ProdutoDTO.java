package com.controle_despesa.model.dto;

import com.controle_despesa.model.entity.Produto;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ProdutoDTO {
    // NAO USAR ATRIBUTOS DE TIPO COMPLEXO!
    private String descricao;
    private String unidadeMedida;
    private double valorUnitario;

    public ProdutoDTO(Produto produto){
        this.descricao = produto.getDescricao();
        this.unidadeMedida = getUnidadeMedida();
        this.valorUnitario = getValorUnitario();
    }

    //metodo que converte a entidade para DTO
    public static List<ProdutoDTO> converter(List<Produto> produtos){
        return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
    }
}
