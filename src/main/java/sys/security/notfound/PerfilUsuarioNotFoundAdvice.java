package sys.security.notfound;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice		
public class PerfilUsuarioNotFoundAdvice {
	@ExceptionHandler(PerfilUsuarioNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String FoundHandler(PerfilUsuarioNotFoundException ex) {
		return ex.getMessage();


}	
}
