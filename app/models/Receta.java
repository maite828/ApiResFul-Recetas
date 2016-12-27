package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;
import models.Tag;
import models.RecIngre;

@Entity
public class Receta extends Model implements Serializable{
	
	@Id
	private Long id;

	@Required
	private String name;
	
	@CreatedTimestamp
	private Timestamp createdAt;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Ingrediente> ingredients = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Tag> tags = new ArrayList<>();
	
	private static final Find<Long, Receta> find = new Find<Long, Receta>() {};

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Timestamp getDateCreation() {
		return createdAt;
	}

	public void setDateCreation(Timestamp fechaCreacion) {
		this.createdAt = fechaCreacion;
	}
	
 	public static List<Receta> findAll() {
		return find.all();
	}

	public static Receta findById(Long id) {
		return find.byId(id);
	}

	public static List<Receta> findByName(String name) {
		return find.where().eq("name", name).findList();
	}
	public static List<Receta> getByName(String recipeName){
		 return find.where().eq("title",recipeName ).findList();	 
	}
	
	public void addIngredient(Ingrediente ingredient){
		this.ingredients.add(ingredient);
		ingredient.recetas.add(this);
	}
	
	public void setIngredients(List<Ingrediente> ingredients) {
		this.ingredients = ingredients;
	}
	
	public List<Ingrediente> getIngredients() {
		return ingredients;
	}
	
	public void addTag(Tag tag){
		this.tags.add(tag);
		tag.recetas.add(this);
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	
	public static List<Receta> findRecipesByTag(Tag tag){
		return find.where().eq("tags.name", tag.getName()).findList();
	}
	
	public JsonNode toJson() {
		return Json.toJson(this);
	}
	
	public JsonNode toJsonList() {		
		ObjectNode node = play.libs.Json.newObject();
		node.put("id", this.id);
		node.put("name", this.name);
		node.put("date", String.valueOf(this.createdAt));
		return node;	
	}
}
