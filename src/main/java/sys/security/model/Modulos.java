package sys.security.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity	
public class Modulos {
	private @Id @GeneratedValue @Column(name="modulo_id") Long id;	
	private String descricaoModulo;
	private String icone;
	private String observacao;
	
	@ManyToMany
    @JoinTable(
        name = "modulos_rotinas",  
        joinColumns = @JoinColumn(name = "modulo_id"),  
        inverseJoinColumns = @JoinColumn(name = "rotina_id") 	
    )
    private Set<Rotinas> modulos_rotinas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoModulo() {
		return descricaoModulo;
	}
	public void setDescricaoModulo(String descricaoModulo) {
		this.descricaoModulo = descricaoModulo;
	}
	public String getIcone() {
		return icone;
	}
	public void setIcone(String icone) {
		this.icone = icone;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Modulos(Long id, String descricaoModulo, String icone, String observacao) {
		super();
		this.id = id;
		this.descricaoModulo = descricaoModulo;
		this.icone = icone;
		this.observacao = observacao;
	}
	public Modulos() {
		super();
	}
	
	
}
