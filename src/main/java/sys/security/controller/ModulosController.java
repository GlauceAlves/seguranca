package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.Modulos;
import sys.security.notfound.ModulosNotFoundException;
import sys.security.repository.ModulosRepository;
	
@RestController
public class ModulosController {
	private final ModulosRepository	 repository;

	public ModulosController(ModulosRepository repository) {
		super();
		this.repository = repository;
	}
	
//	@Autowired
//    private ModulosRepository modulorepository;
	
	@GetMapping("/modulos")	
	List<Modulos> all(){
		return repository.findAll();	
	}
	
	@PostMapping("/modulos")
	Modulos newModulos(@RequestBody Modulos newModulos ) {
		return repository.save(newModulos);
	}
	
	@PutMapping("/modulos/{id}")
	Modulos onModulo(@RequestBody Modulos oneModulo, @PathVariable Long id) {
		return repository.findById(id).map(Modulos -> {
			Modulos.setDescricaoModulo (oneModulo.getDescricaoModulo());
			Modulos.setIcone(oneModulo.getIcone());
			Modulos.setObservacao(oneModulo.getObservacao());
			return repository.save(Modulos);	
		}).orElseGet(() -> {
			return repository.save(oneModulo);
		});	

	}
	
	@GetMapping("/modulos/{id}")
	Modulos oneModulo(@PathVariable Long id) {	
		return repository.findById(id)
				.orElseThrow(()-> new ModulosNotFoundException(id));
	}
	
	@DeleteMapping("/modulos/{id}")
		void deleteModulos(@PathVariable Long id) {
		repository.deleteById(id);
	}
		
	
	
}
		