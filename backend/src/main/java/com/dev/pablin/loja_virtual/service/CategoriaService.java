package com.dev.pablin.loja_virtual.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.pablin.loja_virtual.entity.Categoria;
import com.dev.pablin.loja_virtual.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria inserir(Categoria categoria) {
        categoria.setDataDeCriacao(new Date());
        Categoria novaCategoria = categoriaRepository.saveAndFlush(categoria);
        return novaCategoria;
    }

    public Categoria alterar(Categoria categoria) {
        categoria.setDataDeAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(categoria);
    }

    public void excluir(Long id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.delete(categoria);

    }
}
