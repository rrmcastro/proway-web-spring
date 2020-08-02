package br.com.proway.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.proway.spring.controller.dto.CursoDTO;
import br.com.proway.spring.modelo.Curso;
import br.com.proway.spring.repository.CursoRepository;

@RestController
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@RequestMapping("/cursos")
	public List<CursoDTO> listar() {
		Curso curso1 = new Curso("Inglês I", "Línguas");
		Curso curso2 = new Curso("Inglês II", "Línguas");
		Curso curso3 = new Curso("Excel Avançado", "Informática");

		return CursoDTO.converter(Arrays.asList(curso1, curso2, curso3));
	}

	@RequestMapping("/cursos/listaTudo")
	public List<Curso> listaTudo() {
		return cursoRepository.findAll();
	}
}
