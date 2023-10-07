package com.dev.pablin.loja_virtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.pablin.loja_virtual.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}