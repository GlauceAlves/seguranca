package sys.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PerfilUsuario {
	private @Id @GeneratedValue Long id;
	private String descricaoPerfil;
	
	
	private String tipoUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoPerfil() {
		return descricaoPerfil;
	}

	public void setDescricaoPerfil(String descricaoPerfil) {
		this.descricaoPerfil = descricaoPerfil;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public PerfilUsuario(Long id, String descricaoPerfil, String tipoUsuario) {
		super();
		this.id = id;
		this.descricaoPerfil = descricaoPerfil;
		this.tipoUsuario = tipoUsuario;
	}

	public PerfilUsuario() {
		super();
	}


}
