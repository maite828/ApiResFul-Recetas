package models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
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

	@ManyToMany(mappedBy =  "ingredients")
	@JsonIgnore
	public Set<Recipe> recipes;
	
	private static final Find<Long,Ingredient> find =new Find<Long,Ingredient>(){};

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
	
	//GESTIÓN INGREDIENTE
	public static List<Ingredient> findByName(String ingredient){
		 return find.where().eq("name",ingredient ).findList(); 
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
		return node;	
	}
	
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + "]";
	}	
	
}
