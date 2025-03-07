package sys.security.notfound;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class EmpresaConfiguracaoNotFoundAdvice {

	@ExceptionHandler(EmpresaConfiguracaoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String EmpresaConfiguracaoFoundHandler(EmpresaConfiguracaoNotFoundException ex) {
		return ex.getMessage();
	}
}
