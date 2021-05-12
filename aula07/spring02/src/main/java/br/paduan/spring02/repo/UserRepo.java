package br.paduan.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.User;

// CRUD = Create, Read, Update, Delete
public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByEmailAndSenha(String email, String senha);
}