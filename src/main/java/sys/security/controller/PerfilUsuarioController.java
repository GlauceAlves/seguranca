package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.PerfilUsuario;
import sys.security.notfound.PerfilUsuarioNotFoundException;
import sys.security.repository.PerfilUsuarioRepository;

@RestController
@RequestMapping("/perfilusurio")
@CrossOrigin(origins = "*") 
public class PerfilUsuarioController {
	private final PerfilUsuarioRepository repository;

	public PerfilUsuarioController(PerfilUsuarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping
	List<PerfilUsuario> all() {
		return repository.findAll();
	}

	@PostMapping
	PerfilUsuario newPerfilUusuario(@RequestBody PerfilUsuario newPerfilUusuario) {
		return repository.save(newPerfilUusuario);
	}
	
	@GetMapping("/{id}")
	PerfilUsuario onePerfilUsuario(@PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new PerfilUsuarioNotFoundException(id));		
	}

	@PutMapping("/{id}")
	PerfilUsuario replacePerfilUsuario(@RequestBody PerfilUsuario newPerfilUsuario, @PathVariable Long id) {
		return repository.findById(id).map(PerfilUsuario -> {
			PerfilUsuario.setDescricaoPerfil(newPerfilUsuario.getDescricaoPerfil());
			PerfilUsuario.setTipoUsuario(newPerfilUsuario.getTipoUsuario());
			return repository.save(PerfilUsuario);
		}).orElseGet(() -> {
			return repository.save(newPerfilUsuario);
		});
	}

	@DeleteMapping("/{id}")
	void deleteEmpresa(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
