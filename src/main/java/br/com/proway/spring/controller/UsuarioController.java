package br.com.proway.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.proway.spring.modelo.Usuario;
import br.com.proway.spring.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping
	public List<Usuario> listaTudo() {
		return usuarioRepository.findAll();
	}

	@PostMapping
	public void cadastrar(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}
}