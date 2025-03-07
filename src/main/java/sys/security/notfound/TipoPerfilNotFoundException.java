package sys.security.notfound;

public class TipoPerfilNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TipoPerfilNotFoundException(Long id) {
		super("Tipo de perfil não encontrado." + id );
	}
	
	

}
