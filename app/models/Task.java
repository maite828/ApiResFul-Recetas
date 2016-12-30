package models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;

@Entity
public class Task extends Model implements Serializable{

	@Id
	public Long id;
	
	@Required
	public String description;
		
	@OneToMany(cascade=CascadeType.ALL, mappedBy="task")
	public List<IngredientTask> taskIngredients;
	
	@JsonIgnore
	@ManyToOne
	public Recipe recipe;
	
	public static final Find<Long,Task> find = new Find<Long,Task>(){};
	
	public static Task findById (Long id){
		return find.byId(id);
	}
}
