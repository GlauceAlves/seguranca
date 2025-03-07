package sys.security.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class TipoPerfil {
	private @Id @GeneratedValue Long id;
	
	private String descricaoTipoPerfil;
	
	@OneToMany(mappedBy="tipoPerfil")
	private List<Usuarios> usuario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoTipoPerfil() {
		return descricaoTipoPerfil;
	}
	public void setDescricaoTipoPerfil(String descricaoTipoPerfil) {
		this.descricaoTipoPerfil = descricaoTipoPerfil;
	}
	public List<Usuarios> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuarios> usuario) {
		this.usuario = usuario;
	}
	public TipoPerfil(Long id, String descricaoTipoPerfil, List<Usuarios> usuario) {
		super();
		this.id = id;
		this.descricaoTipoPerfil = descricaoTipoPerfil;
		this.usuario = usuario;
	}
	public TipoPerfil() {
		super();
	}

}