package model.dao;

import infra.ConexaoMysql;
import model.entity.Gato;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GatoDao implements DAOGenerico<Gato>{

    private ConexaoMysql conexao;
    private String query = "";

    public GatoDao() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Gato gato) throws SQLException {
        query = "insert into gato(nome_animal, data_nascimento, raca, cor, sexo) " +
                "values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, gato.getNomeAnimal());
            stmt.setString(2, gato.getDataNascimento());
            stmt.setString(3, gato.getRaca());
            stmt.setString(4, gato.getCor());
            stmt.setString(5, gato.getSexo());

            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void saveAll(List<Gato> gatos) throws SQLException {
        query = "INSERT INTO cachorro (nome_animal, data_nascimento, raca, cor, sexo) " +
                "VALUES(?, ?, ?, ?, ?)";
        for (Gato gato : gatos) {
            try {
                PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

                stmt.setString(1, gato.getNomeAnimal());
                stmt.setString(2, gato.getDataNascimento());
                stmt.setString(3, gato.getRaca());
                stmt.setString(4, gato.getCor());
                stmt.setString(5, gato.getSexo());

                stmt.execute();

            } catch (SQLException e) {
                this.conexao.rollback();
                throw e;
            }
        }
    }

    @Override
    public List<Gato> findAll() throws SQLException {
            query = "select codigo_gato, nome_animal, data_nascimento, raca, cor, sexo from gato";
            try {
                PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
                ResultSet resultSet = stmt.executeQuery();

                List<Gato> listaAnimais = new ArrayList<>();

                while (resultSet.next()) {
                    Gato g = new Gato(resultSet.getString("nome_animal"),
                            resultSet.getString("data_nascimento"),
                            resultSet.getString("raca"), resultSet.getString("cor"),
                            resultSet.getString("sexo"));
                    g.setCodigoGato(resultSet.getInt("codigo_gato"));
                    listaAnimais.add(g);
                }
                return listaAnimais;
            } catch (SQLException e) {
                throw e;
            }
    }

    @Override
    public void merge(Gato gato) throws SQLException {
            query = "update gato set nome_animal = ? where codigo_gato = ?";
            try {
                PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

                stmt.setString(1, gato.getNomeAnimal());
                stmt.setInt(2, gato.getCodigoGato());

                stmt.executeUpdate();
                this.conexao.commit();

            } catch (SQLException e) {
                this.conexao.rollback();
                throw e;
            }
    }

    @Override
    public Gato findById(int gatoId) throws SQLException {
        query = "select codigo_gato, nome_animal, data_nascimento, raca, cor, sexo from gato where codigo_dono = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, gatoId);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                Gato pesquisado = new Gato(resultSet.getString("nome_animal"),
                        resultSet.getString("data_nascimento"),
                        resultSet.getString("raca"), resultSet.getString("cor"),
                        resultSet.getString("sexo"));
                pesquisado.setCodigoGato(resultSet.getInt("codigo_gato"));
                return pesquisado;
            }

        } catch (SQLException e) {
            throw e;
        }
        return null;
    }

    @Override
    public void delete(int codigoGato) throws SQLException, ClassNotFoundException {
        query = "delete from gato where codigo_gato = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoGato);
            stmt.executeUpdate();
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public String idade(Gato codigoAnimal) throws SQLException {
        query = "SELECT concat(format(DATEDIFF(CURDATE(), data_nascimento) / 365, 0), anos) as 'idade' from gato where codigo_gato = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoAnimal.getCodigoGato());
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
