package com.controle_despesa.mode.repositories;

import com.controle_despesa.mode.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
