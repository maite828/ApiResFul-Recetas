package models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;

@Entity
public class Ingrediente extends Model{
	@Id
	private Long id;

	@Required
	private String nombre;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ingrediente")
    private Set<RecIngre> recIngrediente = new HashSet<RecIngre>();

}
