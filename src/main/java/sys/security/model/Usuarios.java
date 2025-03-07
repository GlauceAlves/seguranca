package sys.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Usuarios {
	private @Id @GeneratedValue Long id;
	private String nomeUsuario;
	
	@ManyToOne
	@JoinColumn(name="tipoPerfil_id")
	private TipoPerfil tipoPerfil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public TipoPerfil getTipoPerfil() {
		return tipoPerfil;
	}

	public void setTipoPerfil(TipoPerfil tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

	public Usuarios(Long id, String nomeUsuario, TipoPerfil tipoPerfil) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.tipoPerfil = tipoPerfil;
	}

	public Usuarios() {
		super();
	}
	

}
