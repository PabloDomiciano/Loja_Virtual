package com.dev.pablin.loja_virtual.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.pablin.loja_virtual.entity.Produto;
import com.dev.pablin.loja_virtual.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Produto inserir(Produto produto) {
        produto.setDataDeCriacao(new Date());
        Produto produtoNovo= produtoRepository.saveAndFlush(produto);
        return produtoNovo;
    }

    public Produto alterar(Produto produto) {
        produto.setDataDeAtualizacao(new Date());
        return produtoRepository.saveAndFlush(produto);
    }

    public void excluir(Long id) {
        Produto produto = produtoRepository.findById(id).get();
        produtoRepository.delete(produto);

    }
}
