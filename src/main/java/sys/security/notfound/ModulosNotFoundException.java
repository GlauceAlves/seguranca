package sys.security.notfound;

public class ModulosNotFoundException extends RuntimeException	 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModulosNotFoundException(Long id) {
		super("Módulo não encontrado!" + id);
	}
	

}
