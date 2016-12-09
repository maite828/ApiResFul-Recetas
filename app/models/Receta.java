package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.Valid;

import com.avaje.ebean.Model;

import play.data.validation.Constraints.Required;

@Entity
public class Receta extends Model {
	@Id
	private Long id;
	
	@Required
	private String nombre;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "receta")
	@Valid
	private List<RecetaIngredientes> ingredientes;
	
	private static final Find<Long, Receta> find = new Find<Long, Receta>() {
	};

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<RecetaIngredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<RecetaIngredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}
}
