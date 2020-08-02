package br.com.proway.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.proway.spring.controller.dto.UsuarioDTO;
import br.com.proway.spring.modelo.Usuario;
import br.com.proway.spring.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping("/usuarios")
	public List<UsuarioDTO> listar() {
		Usuario usuario1 = new Usuario("Ricardo Castro", "ricardo@gmail.com", "123456");
		Usuario usuario2 = new Usuario("Ricardo Castro", "ricardo@gmail.com", "123456");
		Usuario usuario3 = new Usuario("Ricardo Castro", "ricardo@gmail.com", "123456");

		return UsuarioDTO.converter(Arrays.asList(usuario1, usuario2, usuario3));
	}

	@RequestMapping("/usuarios/listaTudo")
	public List<Usuario> listaTudo() {
		return usuarioRepository.findAll();
	}
}
