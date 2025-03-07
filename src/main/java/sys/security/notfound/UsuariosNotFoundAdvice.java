package sys.security.notfound;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UsuariosNotFoundAdvice {
	@ExceptionHandler(UsuariosNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String FoundHandler(UsuariosNotFoundException ex) {
		return ex.getMessage();
}
	
}	
