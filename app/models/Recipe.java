package models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

@Entity
public class Recipe extends Model implements Serializable {
	@Id
	private Long id;

	@Required
	@JsonIgnore
	private String name;

	@Required
	@JsonIgnore
	public Integer portions;

	@CreatedTimestamp
	@JsonIgnore
	private Timestamp createdAt;

	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	public List<Ingredient> ingredients;

	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Tag> tags;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
	@JsonIgnore
	public List<Task> tasks;

	private static final Find<Long, Recipe> find = new Find<Long, Recipe>() {
	};

	public Recipe() {
		this.ingredients = new ArrayList<>();
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

	public Integer getPortions() {
		return portions;
	}

	public void setPortions(Integer portions) {
		this.portions = portions;
	}

	// GESTIÓN RECETAS
	public static List<Recipe> findAll() {
		return find.all();
	}

	public static Recipe findById(Long id) {
		return find.byId(id);
	}

	public static List<Recipe> findByName(String name) {
		return find.where().eq("name", name).findList();
	}

	// GESTIÓN INGREDIENTES
	public void addIngrRec(Ingredient ingredient) {
		this.ingredients.add(ingredient);
		ingredient.addRecipe(this);
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	// GESTION DE TAGS
	public void addTagRec(Tag tag) {
		this.tags.add(tag);
		tag.recipes.add(this);
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static List<Recipe> findRecipesByTag(Tag tag) {
		return find.where().eq("tags.name", tag.getName()).findList();
	}

	// TRATAMIENTO
	public JsonNode toJson() {
		return Json.toJson(this);
	}

	public JsonNode toJsonList() {
		ObjectNode nodeRecipe = play.libs.Json.newObject();
		nodeRecipe.put("id", this.id);
		nodeRecipe.put("name", this.name);
		nodeRecipe.put("portions", this.portions);
		nodeRecipe.put("date", String.valueOf(this.createdAt));
		return nodeRecipe;
	}

}
