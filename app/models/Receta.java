package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import com.avaje.ebean.Model;

import play.data.validation.Constraints.Required;

@Entity
public class Receta extends Model {
	@Id
	private Long id;
	
	@Required
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "receta")
	@Valid
	private List<RecetaIngredientes> ingredientes;
	
	private static final Find<Long, Receta> find = new Find<Long, Receta>() {
	};
	
}
