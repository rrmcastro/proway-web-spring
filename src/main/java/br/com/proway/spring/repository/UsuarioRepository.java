package br.com.proway.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.proway.spring.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
