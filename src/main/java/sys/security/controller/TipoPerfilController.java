package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.TipoPerfil;
import sys.security.notfound.TipoPerfilNotFoundException;
import sys.security.repository.TipoPerfilRepository;

@RestController
public class TipoPerfilController {
	private final TipoPerfilRepository repository;

	public TipoPerfilController(TipoPerfilRepository repository) {
		super();
		this.repository = repository;
	}

	@GetMapping("/tipoperfil")
	List<TipoPerfil> all() {
		return repository.findAll();
	}

	@PostMapping("/tipoperfil")
	TipoPerfil newTipoPefil(@RequestBody TipoPerfil newTipoPerfil) {
		return repository.save(newTipoPerfil);
	}

	@PutMapping("/tipoperfil/{id}")
	TipoPerfil replaceTipoPerfil(@RequestBody TipoPerfil newTipoPerfil, @PathVariable Long id) {
		return repository.findById(id)
				.map(TipoPerfil -> {
					TipoPerfil.setDescricaoTipoPerfil(newTipoPerfil.getDescricaoTipoPerfil());
					return repository.save(TipoPerfil);
				})
				.orElseGet(() -> {
		 	        return repository.save(newTipoPerfil);
		 	      });
		
	}
	

	@GetMapping("/tipoperfil/{id}")
	TipoPerfil oneTipoPerfil(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new TipoPerfilNotFoundException(id));
	}

	@DeleteMapping("/tipoperfil/{id}")
	void deleteTipoPerfil(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
