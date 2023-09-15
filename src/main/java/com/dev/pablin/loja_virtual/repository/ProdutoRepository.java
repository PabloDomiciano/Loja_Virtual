package com.dev.pablin.loja_virtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.pablin.loja_virtual.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
