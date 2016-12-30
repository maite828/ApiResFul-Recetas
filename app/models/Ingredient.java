package models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
import com.avaje.ebean.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;

@Entity
public class Ingredient extends Model implements Serializable{
	@Id
	private Long id;

	@Required
	@JsonIgnore
	private String name;
	
	@Required
	@JsonIgnore
	public Float quantity;

	@ManyToMany(mappedBy =  "ingredients")
	@JsonIgnore
	public Set<Recipe> recipes;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="ingredient")
	public List<IngredientTask> ingredientTasks;
	
	public static final Find<Long,Ingredient> find =new Find<Long,Ingredient>(){};

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	//GESTIÓN INGREDIENTE
	public static List<Ingredient> findAll() {
		return find.all();
	}
	
	public static Ingredient findById (Long id){
		return find.byId(id);
	}
	
	public static List<Ingredient> findByName(String name) {
		return find.where().eq("name", name).findList();
	}
	
	public void addRecipe(Recipe recipe){
		this.recipes.add(recipe);
	}

	public JsonNode toJson() {
		return Json.toJson(this);
	}
	
	public JsonNode toJsonList() {		
		ObjectNode node = play.libs.Json.newObject();
		node.put("id", this.id);
		node.put("name", this.name);
		node.put("quantity", this.quantity);
		return node;	
	}
	
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + "]";
	}	
	
}
