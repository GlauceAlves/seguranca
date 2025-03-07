package sys.security.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Rotinas {
	private @Id @GeneratedValue @Column(name="rotina_id") Long id;
	private String descricaoRotina;
	private String observacao;
	
	 @ManyToMany(mappedBy = "modulos_rotinas")
	 private Set<Modulos> modulos; 
	 
	public Long getId() {
		return id; 	
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoRotina() {
		return descricaoRotina;
	}
	public void setDescricaoRotina(String descricaoRotina) {
		this.descricaoRotina = descricaoRotina;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Rotinas(Long id, String descricaoRotina, String observacao) {
		super();
		this.id = id;
		this.descricaoRotina = descricaoRotina;
		this.observacao = observacao;
	}
	public Rotinas() {
		super();
	}

	
}
