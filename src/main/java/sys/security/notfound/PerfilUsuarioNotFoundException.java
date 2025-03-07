 package sys.security.notfound;

public class PerfilUsuarioNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PerfilUsuarioNotFoundException(Long id) {
		super("Perfil do usuário " + id + "não encontrado.");
	}
	
	

}
