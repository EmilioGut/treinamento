package br.paduan.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.Conta;

public interface ContaRepo extends CrudRepository<Conta, Integer> {
    
}
