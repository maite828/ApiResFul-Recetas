package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class IngredientTask extends Model implements Serializable {

	@Id
	public Long id;

	@ManyToOne
	@JsonIgnore
	public Task task;

	@ManyToOne
	@JsonIgnore
	public Ingredient ingredient;

	public static final Find<Long, IngredientTask> find = new Find<Long, IngredientTask>() {};

}
