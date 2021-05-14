package br.paduan.spring03.repo;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring03.model.Usuario;

public interface UsuarioRepo extends CrudRepository <Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);
}
