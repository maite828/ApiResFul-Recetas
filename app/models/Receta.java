package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;
import models.Tag;
import models.RecIngre;

@Entity
public class Receta extends Model implements Serializable{
	@Id
	private Long id;

	// @Valid
	@Required
	private String name;

	//@Required
	private Date createdAt;

	@JsonIgnore
	@OneToMany(mappedBy = "receta")
	private Set<RecIngre> recIngrediente = new HashSet<RecIngre>();

	@ManyToMany(cascade = CascadeType.PERSIST)
	private Set<Tag> tags;

	private Receta(String name) {
		this.tags = new TreeSet<Tag>();
		this.name = name;
		this.createdAt = new Date();
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

	public Receta tagItWith(String name) {
		this.tags.add(Tag.findOrCreateByName(name));
		return this;
	}

	private static final Find<Long, Receta> find = new Find<Long, Receta>() {
	};

	public static Receta findById(Long id) {
		return find.byId(id);
	}

	public static List<Receta> findByName(String name) {
		return find.where().eq("name", name).findList();
	}

	public static List<Receta> findPage(Integer page, Integer count) {
		return find.setFirstRow(page * count).setMaxRows(count).findList();
	}

	public JsonNode toJson() {
		return Json.toJson(this);
	}

	public void setRecIngre(RecIngre ri) {
		this.recIngrediente.add(ri);
	}

}
