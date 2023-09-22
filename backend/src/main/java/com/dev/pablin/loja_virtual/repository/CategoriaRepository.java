package com.dev.pablin.loja_virtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.pablin.loja_virtual.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
