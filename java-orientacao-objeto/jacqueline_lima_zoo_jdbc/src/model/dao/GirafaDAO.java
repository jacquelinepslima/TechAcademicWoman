package model.dao;

import infra.ConexaoMysql;
import model.entity.Gato;
import model.entity.Girafa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GirafaDAO implements DAOGenerico<Girafa>{

    private ConexaoMysql conexao;
    private String query = "";

    public GirafaDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Girafa girafa) throws SQLException {
        query = "insert into girafa(nome_animal, data_nascimento, raca, cor, sexo) " +
                "values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, girafa.getNomeAnimal());
            stmt.setString(2, girafa.getDataNascimento());
            stmt.setString(3, girafa.getRaca());
            stmt.setString(4, girafa.getCor());
            stmt.setString(5, girafa.getSexo());

            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void saveAll(List<Girafa> girafas) throws SQLException {
        query = "INSERT INTO girafa (nome_animal, data_nascimento, raca, cor, sexo) " +
                "VALUES(?, ?, ?, ?, ?)";
        for (Girafa girafa : girafas) {
            try {
                PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

                stmt.setString(1, girafa.getNomeAnimal());
                stmt.setString(2, girafa.getDataNascimento());
                stmt.setString(3, girafa.getRaca());
                stmt.setString(4, girafa.getCor());
                stmt.setString(5, girafa.getSexo());

                stmt.execute();

            } catch (SQLException e) {
                this.conexao.rollback();
                throw e;
            }
        }
    }

    @Override
    public List<Girafa> findAll() throws SQLException {
        query = "select codigo_girafa, nome_animal, data_nascimento, raca, cor, sexo from girafa";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            List<Girafa> listaAnimais = new ArrayList<>();

            while (resultSet.next()) {
                Girafa g1 = new Girafa(resultSet.getString("nome_animal"),
                        resultSet.getString("data_nascimento"),
                        resultSet.getString("raca"), resultSet.getString("cor"),
                        resultSet.getString("sexo"));
                g1.setCodigoGirafa(resultSet.getInt("codigo_girafa"));
                listaAnimais.add(g1);
            }
            return listaAnimais;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void merge(Girafa girafa) throws SQLException {
        query = "update girafa set nome_animal = ? where codigo_girafa = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, girafa.getNomeAnimal());
            stmt.setInt(2, girafa.getCodigoGirafa());

            stmt.executeUpdate();
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public Girafa findById(int girafaId) throws SQLException {
        query = "select codigo_girafa, nome_animal, data_nascimento, raca, cor, sexo from girafa where codigo_dono = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, girafaId);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                Girafa pesquisado = new Girafa(resultSet.getString("nome_animal"),
                        resultSet.getString("data_nascimento"),
                        resultSet.getString("raca"), resultSet.getString("cor"),
                        resultSet.getString("sexo"));
                pesquisado.setCodigoGirafa(resultSet.getInt("codigo_girafa"));
                return pesquisado;
            }

        } catch (SQLException e) {
            throw e;
        }
        return null;
    }

    @Override
    public void delete(int codigoGirafa) throws SQLException, ClassNotFoundException{
        query = "delete from girafa where codigo_girafa = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoGirafa);
            stmt.executeUpdate();
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }

    }

    public String idade(Girafa codigoAnimal) throws SQLException {
        query = "SELECT concat(format(DATEDIFF(CURDATE(), data_nascimento) / 365, 0), anos) as 'idade' from girafa where codigo_girafa = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoAnimal.getCodigoGirafa());
            stmt.execute();

            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("idade");
            }
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
        return "";
    }
}
