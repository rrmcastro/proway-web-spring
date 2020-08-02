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

//	@RequestMapping("/cursos/listarFixo")
//	public List<CursoDTO> listar() {
//		Curso curso1 = new Curso("Inglês I", "Línguas");
//		Curso curso2 = new Curso("Inglês II", "Línguas");
//		Curso curso3 = new Curso("Excel Avançado", "Informática");
//
//		return CursoDTO.converter(Arrays.asList(curso1, curso2, curso3));
//	}

	@GetMapping
	public List<CursoDTO> listaTudo() {
		return CursoDTO.converter(cursoRepository.findAll());
	}

	@PostMapping
	public void cadastrar(@RequestBody Curso curso) {
		cursoRepository.save(curso);
	}
}