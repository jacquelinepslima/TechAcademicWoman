package com.br.orientacaooo.model.dao;

import com.br.orientacaooo.infra.ConexaoMysql;
import com.br.orientacaooo.model.entity.Fornecedor;
import com.br.orientacaooo.model.entity.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO implements DaoGenerico<Fornecedor>{

    private ConexaoMysql conexao;
    private String query = "";


    public FornecedorDAO() throws SQLException, ClassNotFoundException{
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Fornecedor fornecedor) throws SQLException{
        query = "insert into fornecedor(nome_fornecedor, cnpj) values(?, ?)";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, fornecedor.getNomeFornecedor());
            stmt.setString(2, fornecedor.getCnpj());

            stmt.execute();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public List<Fornecedor> findAll() throws SQLException {
        query = "SELECT codigo_fornecedor, nome_fornecedor, cnpj FROM fornecedor";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            List<Fornecedor> listaPesquisada = new ArrayList<>();

            while(resultSet.next()){
                Fornecedor f = new Fornecedor(resultSet.getString("nome_fornecedor"),
                        resultSet.getString("cnpj"));
                f.setCodigoFornecedor(resultSet.getInt("codigo_fornecedor"));
                listaPesquisada.add(f);
            }
                return listaPesquisada;
        }catch (SQLException e){
            throw e;
        }
    }


public void delete(int codigoFornecedor) throws SQLException, ClassNotFoundException {
        query = "DELETE FROM fornecedor WHERE CODIGO_FORNECEDOR = ?;";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoFornecedor);
            stmt.executeUpdate();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void merge(Fornecedor fornecedor) throws SQLException {
        query = "update fornecedor set nome_fornecedor = ?, cnpj =? where codigo_fornecedor = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, fornecedor.getNomeFornecedor());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setInt(3, fornecedor.getCodigoFornecedor());

            stmt.executeUpdate();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public Fornecedor findById(int fornecedorId) throws SQLException {
        query = "select codigo_fornecedor, nome_fornecedor, cnpj from fornecedor where codigo_fornecedor = ?";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, fornecedorId);
            ResultSet resultSet = stmt.executeQuery();

            if(resultSet.next()){
                Fornecedor pesquisado = new Fornecedor(resultSet.getString("nome_fornecedor"),
                        resultSet.getString("cnpj"));
                pesquisado.setCodigoFornecedor(resultSet.getInt("codigo_fornecedor"));
                return pesquisado;
            }

        }catch (SQLException e){
            throw e;
        }
        return null;
    }
}
