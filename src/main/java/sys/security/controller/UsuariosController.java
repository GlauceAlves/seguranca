package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.Usuarios;
import sys.security.notfound.PerfilUsuarioNotFoundException;
import sys.security.repository.UsuariosRepository;

@RestController
public class UsuariosController {

	private final UsuariosRepository repository;

	public UsuariosController(UsuariosRepository repository) {
		super();
		this.repository = repository;
	}

	@GetMapping("/usuarios")
	List<Usuarios> all() {
		return repository.findAll();
	}

	@PostMapping("/usuarios")
	Usuarios newUsuarios(@RequestBody Usuarios newUsuarios) {
		return repository.save(newUsuarios);
	}

	@PutMapping("/usuarios/{id}")
	Usuarios replaceUsuarios(@RequestBody Usuarios newUsuarios, @PathVariable Long id) {
		return repository.findById(id).map(Usuarios -> {
			Usuarios.setNomeUsuario(newUsuarios.getNomeUsuario());
			Usuarios.setTipoPerfil(newUsuarios.getTipoPerfil());
			return repository.save(newUsuarios);
		}).orElseGet(() -> {
			return repository.save(newUsuarios);
		});
	}
	
	@GetMapping("/usuarios/{id}")
	Usuarios oneUsuario(@PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new PerfilUsuarioNotFoundException(id));
	}

	@DeleteMapping("/usuarios/{id}")
	void deleteUsuario(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
