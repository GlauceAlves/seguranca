package sys.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sys.security.model.EmpresaConfiguracao;
import sys.security.repository.EmpresaConfiguracaoRepository;

@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(EmpresaConfiguracaoRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new EmpresaConfiguracao("Worldwidesystem", "widesys")));
			
		};
	}
}
