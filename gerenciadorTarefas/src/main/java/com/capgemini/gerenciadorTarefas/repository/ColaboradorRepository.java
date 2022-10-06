package com.capgemini.gerenciadorTarefas.repository;

import com.capgemini.gerenciadorTarefas.model.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends CrudRepository<Colaborador, Integer> {
}
