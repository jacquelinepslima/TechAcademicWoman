package com.br.orientacaooo.server;

import com.br.orientacaooo.model.dao.FornecedorDAO;
import com.br.orientacaooo.model.dao.ProdutoDAO;
import com.br.orientacaooo.model.entity.Fornecedor;
import com.br.orientacaooo.model.entity.Produto;

import java.sql.SQLException;
import java.util.Scanner;

//REPRESENTA A TELA DO USUÁRIO

public class PrincipalCadastro {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        //criamos e inserimos
        Produto p = new Produto("Coxa de frango", 20.0);

        //salvamos e listamos o que tem dentro do banco
        ProdutoDAO produtoDAO = new ProdutoDAO();
        //produtoDAO.save(p);
        //System.out.println(produtoDAO.findAll());

        produtoDAO.delete(15);


        Fornecedor f = new Fornecedor("Jacqueline vinda do java", "12.345.678/0001-23");

        FornecedorDAO fDAO1 = new FornecedorDAO();
       // fDAO1.save(f);

        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        //System.out.println(fornecedorDAO.findAll());
        //fornecedorDAO.delete(10);

        /* ProdutoDAO prodListar = new ProdutoDAO();
        System.out.println("Lista de Produtos");
        System.out.println(prodListar.findAll());

        String descricaoNovo = "Carne de frango moida";
        double precoNovo = 19.10;
        int idAlterar = 1;

        Produto prodAtualizado = new Produto(descricaoNovo, precoNovo);
        prodAtualizado.setCodigoProduto(idAlterar);
        ProdutoDAO prodAtualizar = new ProdutoDAO();
        prodAtualizar.merge(prodAtualizado);

        System.out.println();
        System.out.println();
        ProdutoDAO prodListar2 = new ProdutoDAO();
        System.out.println("Lista de produtos atualizados: ");
        System.out.println(prodListar2.findAll());*/

        /* System.out.println("Lista de Fornecedores");
        FornecedorDAO fornListar = new FornecedorDAO();
        System.out.println(fornListar.findAll());

        Fornecedor fornAtualizado = new Fornecedor("Jacqueline P.S. Lima", "12.345.678/0001-09");
        fornAtualizado.setCodigoFornecedor(9);
        FornecedorDAO fornAtualizar = new FornecedorDAO();
        fornAtualizar.merge(fornAtualizado);

        System.out.println();
        System.out.println();
        System.out.println("Lista de fornecedores atualizados: ");
        FornecedorDAO fornListar2 = new FornecedorDAO();
        System.out.println(fornListar2.findAll());*/


        ProdutoDAO produto = new ProdutoDAO();
        System.out.println("Pesquisa de produto por id: ");
        System.out.println(produto.findById(1));

        System.out.println("---------------");

        FornecedorDAO fornecedor = new FornecedorDAO();
        System.out.println("Pesquisa de fornecedor por id: ");
        System.out.println(fornecedor.findById(1));

        sc.close();
    }
}
