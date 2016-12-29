package models;

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
public class Tag extends Model{
	@Id
	private Long id;
	
	@Required
	@JsonIgnore
	private String name;
    
	@ManyToMany(mappedBy = "tags")
	@JsonIgnore
    public Set<Receta> recetas;
	
	private static final Find<Long,Tag> find =new Find<Long,Tag>(){};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	//GESTIÓN TAGS
	public void addReceta(Receta receta){
		this.recetas.add(receta);
	}

	public static List<Tag> getByName(String tagName){
		 return find.where().eq("name",tagName ).findList(); 
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
		return "Tag [name=" + name + "]";
	}	
 
}
