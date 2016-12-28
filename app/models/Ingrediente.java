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

import play.data.validation.Constraints.Required;
import play.libs.Json;

@Entity
public class Ingrediente extends Model implements Serializable{
	@Id
	private Long id;

	@Required
	@JsonIgnore
	private String name;

	@ManyToMany(mappedBy =  "ingredientes")
	@JsonIgnore
	public Set<Receta> recetas;
	
	private static final Find<Long,Ingrediente> find =new Find<Long,Ingrediente>(){};

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
	public static List<Ingrediente> getByName(String ingrediente){
		 return find.where().eq("name",ingrediente ).findList(); 
	}
	
	public void addReceta(Receta receta){
		this.recetas.add(receta);
	}

	public JsonNode toJson() {
		return Json.toJson(this);
	}
	@Override
	public String toString() {
		return "Ingrediente [id=" + id + ", name=" + name + "]";
	}
	
	
}
