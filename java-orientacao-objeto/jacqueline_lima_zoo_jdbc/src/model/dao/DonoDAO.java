package model.dao;

import infra.ConexaoMysql;
import model.entity.DonoAnimal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
    adicionar um dono(save), alterar o dono(merge)
     */
public class DonoDAO implements DAOGenerico<DonoAnimal> {

    private ConexaoMysql conexao;
    private String query = "";


    public DonoDAO() throws SQLException, ClassNotFoundException{
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(DonoAnimal donoAnimal) throws SQLException{
        query = "insert into dono_animal(nome_dono, endereco) values(?, ?)";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, donoAnimal.getNomeDono());
            stmt.setString(2, donoAnimal.getEndereco());

            stmt.execute();
            this.conexao.commit();
        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void saveAll(List<DonoAnimal> donos) throws SQLException {
    }

    @Override
    public List<DonoAnimal> findAll() throws SQLException {
        query = "SELECT codigo_dono, nome_dono, endereco FROM dono_animal";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            List<DonoAnimal> listaDonosAnimais = new ArrayList<>();

            while(resultSet.next()){
                DonoAnimal dA = new DonoAnimal(resultSet.getString("nome_dono"),
                        resultSet.getString("endereco"));
                dA.setCodigoDono(resultSet.getInt("codigo_dono"));
                listaDonosAnimais.add(dA);
            }
            return listaDonosAnimais;
        }catch (SQLException e){
            throw e;
        }
    }

    @Override
    public void merge(DonoAnimal alterarDono) throws SQLException {
        query = "update dono_animal set nome_dono = ? where codigo_dono = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, alterarDono.getNomeDono());
            stmt.setInt(2, alterarDono.getCodigoDono());


            stmt.executeUpdate();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public DonoAnimal findById(int cachorroId) throws SQLException {
        return null;
    }

    @Override
    public void delete(int codigoDono) throws SQLException, ClassNotFoundException {
        query = "delete from dono_animal where codigo_dono = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoDono);
            stmt.executeUpdate();
            this.conexao.commit();

        }catch (SQLException e){
            this.conexao.rollback();
            throw e;
        }
    }

    public DonoAnimal findById(int codigoAnimal, int codigoDono) throws SQLException {
        query = "select dono_nome, endereco where codigo_dono = ?";
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoAnimal);
            stmt.setInt(2, codigoDono);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                DonoAnimal pesquisado = new DonoAnimal(resultSet.getString("nome_dono"),
                        resultSet.getString("endereco"));
                pesquisado.setCodigoDono(resultSet.getInt("codigo_dono"));
                return pesquisado;
            }

        }catch (SQLException e){
            throw e;
        }
        return null;
    }
}
