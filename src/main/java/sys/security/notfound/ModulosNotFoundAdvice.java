package sys.security.notfound;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ModulosNotFoundAdvice {

	@ExceptionHandler(ModulosNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String FoundHandler(ModulosNotFoundException ex) {
		return ex.getMessage();

	}

}
