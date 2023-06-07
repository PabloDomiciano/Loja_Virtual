package com.dev.pablin.loja_virtual.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.pablin.loja_virtual.entity.Pessoa;
import com.dev.pablin.loja_virtual.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }

    public Pessoa inserir(Pessoa pessoa) {
        pessoa.setDataCriacao(new Date());
        Pessoa pessoaNova = pessoaRepository.saveAndFlush(pessoa);
        return pessoaNova;
    }

    public Pessoa alterar(Pessoa pessoa){
        pessoa.setDataAlteracao(new Date());
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public void excluir(Long id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoaRepository.delete(pessoa);

    }
}
