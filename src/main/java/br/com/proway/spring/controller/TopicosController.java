package br.com.proway.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.proway.spring.controller.dto.TopicoDTO;
import br.com.proway.spring.modelo.Topico;
import br.com.proway.spring.repository.TopicoRepository;

@RestController
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;

//	@RequestMapping("/topicos")
//	public List<TopicoDTO> listar() {
//		Topico topico = new Topico("Duvidas", "Dúvidas iniciais com spring", new Curso("Spring", "Programação"));
//
//		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
//	}

	@RequestMapping("/topicos/semconverter")
	public List<Topico> listaTudoSemConverter() {
		return topicoRepository.findAll();
	}

	@RequestMapping("/topicos")
	public List<TopicoDTO> listaTudo() {
		return TopicoDTO.converter(topicoRepository.findAll());
	}
}
