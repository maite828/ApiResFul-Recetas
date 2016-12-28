package models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;

@Entity
public class Receta extends Model implements Serializable{
	@Id
	private Long id;

	@Required
	@JsonIgnore
	private String name;
	
	@CreatedTimestamp
	@JsonIgnore
	private Timestamp createdAt;

	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Ingrediente> ingredientes;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Tag> tags;
	
	private static final Find<Long, Receta> find = new Find<Long, Receta>() {};
	
	public Receta(){
		this.ingredientes = new ArrayList<>();
		this.tags = new ArrayList<>();
	}
	
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
	public String getDateCreation() {
		return String.valueOf(createdAt);
	}
	public void setDateCreation(Timestamp fechaCreacion) {
		this.createdAt = fechaCreacion;
	}
	
	//GESTIÓN RECETAS
 	public static List<Receta> findAll() {
		return find.all();
	}

	public static Receta findById(Long id) {
		return find.byId(id);
	}

	public static List<Receta> findByName(String name) {
		return find.where().eq("name", name).findList();
	}
	public static List<Receta> getByName(String name){
		 return find.where().eq("name", name).findList();	 
	}
	
	//GESTIÓN INGREDIENTES
	public void addIngredient(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
		ingrediente.addReceta(this);
	}
	
	public void setIngredients(List<Ingrediente> ingredients) {
		this.ingredientes = ingredients;
	}
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	//GESTION DE TAGS
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
	
	//TRATAMIENTO
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
