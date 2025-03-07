package sys.security.notfound;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TipoPerfilNotFoundAdivice {
	@ExceptionHandler(TipoPerfilNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String FoundHandler(TipoPerfilNotFoundException ex) {
		return ex.getMessage();

	}
}
