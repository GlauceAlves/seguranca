package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.EmpresaConfiguracao;
import sys.security.notfound.EmpresaConfiguracaoNotFoundException;
import sys.security.repository.EmpresaConfiguracaoRepository;

@RestController
public class EmpresaConfiguracaoController {

	private final EmpresaConfiguracaoRepository repository;

	public EmpresaConfiguracaoController(EmpresaConfiguracaoRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/empresaconfiguracao")
	List<EmpresaConfiguracao> all() {
		return repository.findAll();
	}

	@PostMapping("/empresaconfiguracao")
	EmpresaConfiguracao newEmpresa(@RequestBody EmpresaConfiguracao newEmpresa) {
		return repository.save(newEmpresa);
	}

	  @GetMapping("/empresaconfiguracao/{id}")
	  EmpresaConfiguracao one(@PathVariable Long id) {
	    
	    return repository.findById(id)
	      .orElseThrow(() -> new EmpresaConfiguracaoNotFoundException(id));
	  }	

	@PutMapping("/empresaconfiguracao/{id}")
 	EmpresaConfiguracao replaceEmpresaConfiguracao(@RequestBody EmpresaConfiguracao newEmpresaConfiguracao, @PathVariable Long id) {
 	    return repository.findById(id)
 	      .map(EmpresaConfiguracao -> {
 	    	EmpresaConfiguracao.setRazao(newEmpresaConfiguracao.getRazao());
 	    	EmpresaConfiguracao.setCodigo(newEmpresaConfiguracao.getCodigo());
 	        return repository.save(EmpresaConfiguracao);
 	      })
 	      .orElseGet(() -> {
 	        return repository.save(newEmpresaConfiguracao);
 	      });
 	  }

	@DeleteMapping("/empresaconfiguracao/{id}")
	void deleteEmpresa(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
