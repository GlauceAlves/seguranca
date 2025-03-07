package sys.security.notfound;

public class RotinasNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RotinasNotFoundException(Long id) {
		super("Rotina não encontrada." + id);
	}
	
	

}
