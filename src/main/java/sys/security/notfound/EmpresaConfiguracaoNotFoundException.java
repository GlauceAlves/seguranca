package sys.security.notfound;

public class EmpresaConfiguracaoNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EmpresaConfiguracaoNotFoundException(Long id) {
		super("Empresa não encontrada. " + id);
	}
	

}
