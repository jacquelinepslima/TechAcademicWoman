package model.dao;

import infra.ConexaoMysql;

import java.sql.SQLException;
import java.util.List;

public interface DAOGenerico<Animal> {
    ConexaoMysql conexao = null;

    void save(Animal animal) throws SQLException;
    void saveAll(List<Animal> animais) throws SQLException;
    List<Animal> findAll() throws SQLException;
    void merge(Animal animal) throws SQLException;
    Animal findById(int cachorroId) throws SQLException;
    void delete(int t) throws SQLException, ClassNotFoundException;
}
