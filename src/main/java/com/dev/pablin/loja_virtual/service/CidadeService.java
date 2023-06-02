package com.dev.pablin.loja_virtual.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dev.pablin.loja_virtual.entity.Cidade;


import com.dev.pablin.loja_virtual.repository.CidadeRepository;

@Service
public class CidadeService {
    
    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodos(){
        return cidadeRepository.findAll();
    }

    public Cidade inserir(Cidade cidade){
        cidade.setDataCriacao(new Date());
        Cidade novaCidade = cidadeRepository.saveAndFlush(cidade);
        return novaCidade;
    }

    public Cidade alterar(Cidade cidade){
        cidade.setDataDeAlteracao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }

    public void excluir(Long id){
        Cidade cidade = cidadeRepository.findById(id).get();
        cidadeRepository.delete(cidade);
    }

}
