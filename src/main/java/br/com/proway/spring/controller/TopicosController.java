package br.com.proway.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.proway.spring.controller.dto.TopicoDTO;
import br.com.proway.spring.modelo.Topico;
import br.com.proway.spring.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos/semconverter")
	public List<Topico> listaTudoSemConverter() {
		return topicoRepository.findAll();
	}

	@GetMapping
	public List<TopicoDTO> listaTudo() {
		return TopicoDTO.converter(topicoRepository.findAll());
	}

	@PostMapping
	public void cadastrar(@RequestBody Topico topico) {
		topicoRepository.save(topico);
	}
}