package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

@Entity
public class RecIngre extends Model{
	
	@Id
	private Long id;

	@ManyToOne
	@JsonIgnore
	private Receta receta;
	
	@ManyToOne
	@JsonIgnore
	private Ingrediente ingrediente;
	
	
}
