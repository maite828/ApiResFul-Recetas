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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;

@Entity
public class Task extends Model implements Serializable {

	@Id
	public Long id;

	@Required
	@JsonIgnore
	public String description;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
	public List<IngredientTask> taskIngredients;

	@ManyToOne
	@JsonIgnore
	public Recipe recipe;

	public static final Find<Long, Task> find = new Find<Long, Task>() {
	};

	public static Task findById(Long id) {
		return find.byId(id);
	}
	
	public JsonNode toJson() {
		return Json.toJson(this);
	}

	public JsonNode toJsonList() {
		ObjectNode node = play.libs.Json.newObject();
		node.put("id", this.id);
		node.put("name", this.description);
		return node;
	}

}
