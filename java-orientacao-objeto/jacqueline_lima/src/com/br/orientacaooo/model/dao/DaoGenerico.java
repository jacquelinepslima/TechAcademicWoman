package com.br.orientacaooo.model.dao;

import com.br.orientacaooo.infra.ConexaoMysql;

import java.sql.SQLException;
import java.util.List;

public interface DaoGenerico<T> {

    ConexaoMysql conexao = null;

    void save(T t) throws SQLException;
    List<T> findAll() throws SQLException;
    void delete(int t) throws SQLException, ClassNotFoundException;
    void merge(T t) throws SQLException;
    T findById(int id) throws SQLException;
}
