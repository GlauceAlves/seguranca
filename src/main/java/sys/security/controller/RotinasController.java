package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.Rotinas;
import sys.security.repository.RotinasRepository;

@RestController	
public class RotinasController {	
	private final RotinasRepository	repository;

	public RotinasController(RotinasRepository repository) {
		super();
		this.repository = repository;
	}	
	@GetMapping("/rotinas")
	List<Rotinas> all() {
		return repository.findAll();
	}
	
	@PostMapping("/rotinas")
	Rotinas newRotina(@RequestBody Rotinas newRotina) {
		return repository.save(newRotina);
	}
}
	