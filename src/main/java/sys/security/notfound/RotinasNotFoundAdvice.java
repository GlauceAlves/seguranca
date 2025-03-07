package sys.security.notfound;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class RotinasNotFoundAdvice {
	@ExceptionHandler(RotinasNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String FoundHandler(RotinasNotFoundException ex) {
		return ex.getMessage();

	}
	

}
