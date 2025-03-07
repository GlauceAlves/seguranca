package sys.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmpresaConfiguracao {
	//  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Id @GeneratedValue Long id;
	private String razao;
	private String codigo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public EmpresaConfiguracao(Long id, String razao, String codigo) {
		super();
		this.id = id;
		this.razao = razao;
		this.codigo = codigo;
	}
	public EmpresaConfiguracao() {
		super();
	}
	public EmpresaConfiguracao(String razao, String codigo) {
		super();
		this.razao = razao;
		this.codigo = codigo;
	}

	
}


