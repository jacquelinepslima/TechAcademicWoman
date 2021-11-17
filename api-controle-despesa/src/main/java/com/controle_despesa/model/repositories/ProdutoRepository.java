package com.controle_despesa.model.repositories;

import com.controle_despesa.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

//manipulacao dos dados
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
