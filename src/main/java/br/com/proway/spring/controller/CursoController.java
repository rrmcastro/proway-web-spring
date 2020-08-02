package br.com.proway.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.proway.spring.controller.dto.CursoDTO;
import br.com.proway.spring.modelo.Curso;
import br.com.proway.spring.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	public List<CursoDTO> listaTudo() {
		return CursoDTO.converter(cursoRepository.findAll());
	}

	@PostMapping
	public void cadastrar(@RequestBody Curso curso) {
		cursoRepository.save(curso);
	}
}