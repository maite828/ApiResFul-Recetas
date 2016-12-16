package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy = "ingrediente")
	private Set<RecIngre> recIngrediente = new HashSet<RecIngre>();

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

	public Set<RecIngre> getRecIngrediente() {
		return recIngrediente;
	}

	public void setRecIngrediente(Set<RecIngre> recIngrediente) {
		this.recIngrediente = recIngrediente;
	}

	public JsonNode toJson() {
		return Json.toJson(this);
	}
}
