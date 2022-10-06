package com.capgemini.gerenciadorTarefas.repository;

import com.capgemini.gerenciadorTarefas.model.Tarefa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {




}
