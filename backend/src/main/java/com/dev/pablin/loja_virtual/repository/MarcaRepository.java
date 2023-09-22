package com.dev.pablin.loja_virtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.pablin.loja_virtual.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    
}
