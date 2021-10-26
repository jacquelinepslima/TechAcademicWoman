package model.dao;

import infra.ConexaoMysql;
import model.entity.Cachorro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CachorroDAO implements DAOGenerico<Cachorro> {

    /*
    Consultar todos os animais cadastrados(findAll) ok, cadastrar um novo(save)ok
    mudar o nome do animal(merge) ok, poder cadastrar mais de um animal por vez,
    visualizar as informações de um animal apresentando o seu respectivo dono
     */

    private ConexaoMysql conexao;
    private String query = "";

    public CachorroDAO() throws SQLException, ClassNotFoundException {
        conexao = new ConexaoMysql();
    }

    @Override
    public void save(Cachorro cachorro) throws SQLException {
        query = "insert into cachorro(nome_animal, data_nascimento, raca, cor, sexo) " +
                "values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, cachorro.getNomeAnimal());
            stmt.setString(2, cachorro.getDataNascimento());
            stmt.setString(3, cachorro.getRaca());
            stmt.setString(4, cachorro.getCor());
            stmt.setString(5, cachorro.getSexo());

            stmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    @Override
    public void saveAll(List<Cachorro> cachorros) throws SQLException {
        query = "INSERT INTO cachorro (nome_animal, data_nascimento, raca, cor, sexo) " +
                "VALUES(?, ?, ?, ?, ?)";
        for (Cachorro cachorro : cachorros) {
            try {
                PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

                stmt.setString(1, cachorro.getNomeAnimal());
                stmt.setString(2, cachorro.getDataNascimento());
                stmt.setString(3, cachorro.getRaca());
                stmt.setString(4, cachorro.getCor());
                stmt.setString(5, cachorro.getSexo());

                stmt.execute();

            } catch (SQLException e) {
                this.conexao.rollback();
                throw e;
            }
        }
        this.conexao.commit();
    }

    @Override
    public List<Cachorro> findAll() throws SQLException {
        query = "select codigo_cachorro, nome_animal, data_nascimento, raca, cor, sexo from cachorro";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();

            List<Cachorro> listaAnimais = new ArrayList<>();

            while (resultSet.next()) {
                Cachorro c = new Cachorro(resultSet.getString("nome_animal"),
                        resultSet.getString("data_nascimento"),
                        resultSet.getString("raca"), resultSet.getString("cor"),
                        resultSet.getString("sexo"));
                c.setCodigoCachorro(resultSet.getInt("codigo_cachorro"));
                listaAnimais.add(c);
            }
            return listaAnimais;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public void merge(Cachorro cachorro) throws SQLException {
        query = "update cachorro set nome_animal = ? where codigo_cachorro = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setString(1, cachorro.getNomeAnimal());
            stmt.setInt(2, cachorro.getCodigoCachorro());

            stmt.executeUpdate();
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public Cachorro findById(int cachorroId) throws SQLException {
        query = "select codigo_cachorro, nome_animal, data_nascimento, raca, cor, sexo from cachorro where codigo_dono = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, cachorroId);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                Cachorro pesquisado = new Cachorro(resultSet.getString("nome_animal"),
                        resultSet.getString("data_nascimento"),
                        resultSet.getString("raca"), resultSet.getString("cor"),
                        resultSet.getString("sexo"));
                pesquisado.setCodigoCachorro(resultSet.getInt("codigo_cachorro"));
                return pesquisado;
            }

        } catch (SQLException e) {
            throw e;
        }
        return null;
    }

    @Override
    public void delete(int codigoCachorro) throws SQLException, ClassNotFoundException {
        query = "delete from cachorro where codigo_cachorro = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);

            stmt.setInt(1, codigoCachorro);
            stmt.executeUpdate();
            this.conexao.commit();

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public String idade(Cachorro codigoAnimal) throws SQLException {
        query = "SELECT concat(format(DATEDIFF(CURDATE(), data_nascimento) / 365, 0), anos) as 'idade' from cachorro where codigo_cachorro = ?";
        try {
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);


            stmt.setInt(1, codigoAnimal.getCodigoCachorro());
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
