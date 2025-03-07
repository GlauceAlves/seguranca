package sys.security.notfound;

public class UsuariosNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuariosNotFoundException(Long id) {
		super("Usuário não encontrado." + id);
	}
	

}
