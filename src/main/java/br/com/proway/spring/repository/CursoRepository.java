package br.com.proway.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.proway.spring.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
