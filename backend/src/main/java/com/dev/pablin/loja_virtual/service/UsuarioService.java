package com.dev.pablin.loja_virtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.pablin.loja_virtual.entity.Usuario;
import com.dev.pablin.loja_virtual.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarUsuarioPorId() {
        return usuarioRepository.findAll();
    }

    public Usuario criarUsuario(Usuario usuario) {
        Usuario novoUsuario = usuarioRepository.saveAndFlush(usuario);
        return novoUsuario;
    }

}