package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;

@Entity
public class RecetaIngredientes extends Model{
	@Id
	private Long id;

	@Required
	private String ingrediente;

	@ManyToMany
	@JsonIgnore
	private Receta receta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}
}
