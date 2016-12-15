package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;

@Entity
public class Ingrediente extends Model{
	@Id
	private Long id;

	@Required
	private String ingrediente;

	@ManyToMany
	@JsonIgnore
	private RecIngre recingre;

}
