package com.br.orientacaooo.model.dao;


/* DAO =
Data Access Object
Objeto de acesso a dados

TERÁ TODAS AS OPERAÇÕES PARA ESSA TABELA DE PRODUTO - CRUD
 */

import com.br.orientacaooo.infra.ConexaoMysql;
import com.br.orientacaooo.model.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO implements DaoGenerico<Produto>{

    private ConexaoMysql conexao;
    private String query = "";


    public ProdutoDAO() throws SQLException, ClassNotFoundException{
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Produto produto) throws SQLException{
        query = "insert into produto(descricao_produto, preco_produto, codigo_fornecedor) values(?, ?, -10)";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, produto.getDescricaoProduto());
            stmt.setDouble(2, produto.getPrecoProduto());

            stmt.execute();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public List<Produto> findAll() throws SQLException {
        query = "SELECT codigo_produto, descricao_produto, preco_produto FROM produto";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            List<Produto> listaPesquisada = new ArrayList<>();

            while(resultSet.next()){
                Produto p = new Produto(resultSet.getString("descricao_produto"),
                        resultSet.getDouble("preco_produto"));
                p.setCodigoProduto(resultSet.getInt("codigo_produto"));
                listaPesquisada.add(p);
            }
            return listaPesquisada;
        }catch (SQLException e){
            throw e;
        }
    }

    @Override
    public void delete(int codigoProduto) throws SQLException {
        query = "DELETE FROM produto WHERE CODIGO_PRODUTO = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoProduto);
            stmt.executeUpdate();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    public void merge(Produto prodAtualizado) throws SQLException {
        query = "update produto set descricao_produto = ?, preco_produto =? where codigo_produto = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, prodAtualizado.getDescricaoProduto());
            stmt.setDouble(2, prodAtualizado.getPrecoProduto());
            stmt.setInt(3, prodAtualizado.getCodigoProduto());

            stmt.executeUpdate();
            this.conexao.commit();

        }
        catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }
    public Produto findById(int produtoId) throws SQLException {
        query = "select codigo_produto, descricao_produto, preco_produto from produto where CODIGO_PRODUTO = ?";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, produtoId);
            ResultSet resultSet = stmt.executeQuery();

            if(resultSet.next()){
                Produto pesquisado = new Produto(resultSet.getString("descricao_produto"),
                        resultSet.getDouble("preco_produto"));
                pesquisado.setCodigoProduto(resultSet.getInt("codigo_produto"));
                return pesquisado;
            }

        }catch (SQLException e){
            throw e;
        }
        return null;
    }
    /*
    public void findById(int id) {
        for (Produto item : listaProduto) {
            if (item.getCodigoProduto() == id) {
                System.out.println(item);
                break;
            }
        }
    }*/
}
