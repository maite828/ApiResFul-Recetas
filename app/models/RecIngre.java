package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;

@Entity
public class RecIngre extends Model implements Serializable{

	@ManyToOne
	@JsonIgnore
	private Receta receta;
	
	@ManyToOne
	@JsonIgnore
	private Ingrediente ingrediente;
	
	public RecIngre(Receta receta, Ingrediente ingrediente) {
		this.receta = receta;
		this.ingrediente = ingrediente;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	public JsonNode toJson() {
		return Json.toJson(this);
	}

}
