package br.com.proway.spring.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.proway.spring.modelo.Curso;

public class CursoDTO {
	private Long id;
	private String nome;
	private String categoria;

	public CursoDTO(Curso curso) {
		this.nome = curso.getNome();
		this.categoria = curso.getCategoria();
	}

	public static List<CursoDTO> converter(List<Curso> cursos) {
		return cursos.stream().map(CursoDTO::new).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}